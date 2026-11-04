package app.rive.runtime.kotlin;

/* JADX INFO: loaded from: classes3.dex */
public interface Observable<ListenerType> {
    void registerListener(ListenerType listenertype);

    void unregisterListener(ListenerType listenertype);
}
