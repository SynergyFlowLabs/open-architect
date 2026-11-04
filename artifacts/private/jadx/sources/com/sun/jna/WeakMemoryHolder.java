package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class WeakMemoryHolder {
    ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    IdentityHashMap<Reference<Object>, Memory> backingMap = new IdentityHashMap<>();

    public synchronized void clean() {
        try {
            ReferenceQueue<Object> referenceQueue = this.referenceQueue;
            while (true) {
                Reference<? extends Object> referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    this.backingMap.remove(referencePoll);
                    referenceQueue = this.referenceQueue;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void put(Object obj, Memory memory) {
        try {
            clean();
            this.backingMap.put(new WeakReference(obj, this.referenceQueue), memory);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
