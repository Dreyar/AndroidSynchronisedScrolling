# AndroidSynchronisedScrolling
Android synchronized recyclerview crash

### This is a demo project to demonstate the following error:

    java.lang.IllegalArgumentException: parameter must be a descendant of this view
        at android.view.ViewGroup.offsetRectBetweenParentAndChild(ViewGroup.java:6143)
        at android.view.ViewGroup.offsetDescendantRectToMyCoords(ViewGroup.java:6072)
  
### Steps to reproduce (using keyboard arrow keys):
* press right till the end 
* press down till the end (or until a crash occures)

### Video demonstations: 
https://youtu.be/HErdtS5tmP8

### Stacktrace:
```2020-02-29 18:31:01.622 13361-13361/com.example.nick.synchronisedscrolling E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.example.nick.synchronisedscrolling, PID: 13361
    java.lang.IllegalArgumentException: parameter must be a descendant of this view
        at android.view.ViewGroup.offsetRectBetweenParentAndChild(ViewGroup.java:6143)
        at android.view.ViewGroup.offsetDescendantRectToMyCoords(ViewGroup.java:6072)
        at android.view.ViewRootImpl$ViewPostImeInputStage.performFocusNavigation(ViewRootImpl.java:5347)
        at android.view.ViewRootImpl$ViewPostImeInputStage.processKeyEvent(ViewRootImpl.java:5469)
        at android.view.ViewRootImpl$ViewPostImeInputStage.onProcess(ViewRootImpl.java:5281)
        at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:4788)
        at android.view.ViewRootImpl$InputStage.onDeliverToNext(ViewRootImpl.java:4841)
        at android.view.ViewRootImpl$InputStage.forward(ViewRootImpl.java:4807)
        at android.view.ViewRootImpl$AsyncInputStage.forward(ViewRootImpl.java:4947)
        at android.view.ViewRootImpl$InputStage.apply(ViewRootImpl.java:4815)
        at android.view.ViewRootImpl$AsyncInputStage.apply(ViewRootImpl.java:5004)
        at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:4788)
        at android.view.ViewRootImpl$InputStage.onDeliverToNext(ViewRootImpl.java:4841)
        at android.view.ViewRootImpl$InputStage.forward(ViewRootImpl.java:4807)
        at android.view.ViewRootImpl$InputStage.apply(ViewRootImpl.java:4815)
        at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:4788)
        at android.view.ViewRootImpl$InputStage.onDeliverToNext(ViewRootImpl.java:4841)
        at android.view.ViewRootImpl$InputStage.forward(ViewRootImpl.java:4807)
        at android.view.ViewRootImpl$AsyncInputStage.forward(ViewRootImpl.java:4980)
        at android.view.ViewRootImpl$ImeInputStage.onFinishedInputEvent(ViewRootImpl.java:5141)
        at android.view.inputmethod.InputMethodManager$PendingEvent.run(InputMethodManager.java:3064)
        at android.view.inputmethod.InputMethodManager.invokeFinishedInputEventCallback(InputMethodManager.java:2607)
        at android.view.inputmethod.InputMethodManager.finishedInputEvent(InputMethodManager.java:2598)
        at android.view.inputmethod.InputMethodManager$ImeInputEventSender.onInputEventFinished(InputMethodManager.java:3041)
        at android.view.InputEventSender.dispatchInputEventFinished(InputEventSender.java:143)
        at android.os.MessageQueue.nativePollOnce(Native Method)
        at android.os.MessageQueue.next(MessageQueue.java:336)
        at android.os.Looper.loop(Looper.java:174)
        at android.app.ActivityThread.main(ActivityThread.java:7356)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
2020-02-29 18:31:01.631 13361-13361/com.example.nick.synchronisedscrolling I/Process: Sending signal. PID: 13361 SIG: 9
```
