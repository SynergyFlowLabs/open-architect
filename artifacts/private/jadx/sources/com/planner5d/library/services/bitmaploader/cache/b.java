package com.planner5d.library.services.bitmaploader.cache;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes10.dex */
public class b<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b<K>.a f224113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f224114b = new Object();

    private class a extends LruCache<K, Bitmap> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(K key, Bitmap value) {
            return value.getByteCount();
        }

        private a(int maxSize) {
            super(maxSize);
        }
    }

    public b(long maxSize) {
        this.f224113a = new a((int) maxSize);
    }

    public void a() {
        synchronized (this.f224114b) {
            try {
                this.f224113a.evictAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Bitmap b(K key) {
        Bitmap bitmap;
        synchronized (this.f224114b) {
            try {
                bitmap = this.f224113a.get(key);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public Bitmap c(K key) {
        Bitmap bitmapRemove;
        synchronized (this.f224114b) {
            bitmapRemove = this.f224113a.remove(key);
        }
        return bitmapRemove;
    }

    public void d(K key, Bitmap bitmap) {
        synchronized (this.f224114b) {
            this.f224113a.put(key, bitmap);
        }
    }
}
