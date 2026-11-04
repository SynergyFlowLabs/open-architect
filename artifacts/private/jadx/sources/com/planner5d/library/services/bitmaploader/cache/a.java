package com.planner5d.library.services.bitmaploader.cache;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.planner5d.library.services.utility.o3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<Object, Integer> f224108a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<Object> f224109b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Object> f224110c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f224111d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b<Object> f224112e;

    public a(long size) {
        this.f224112e = new b<>(size);
    }

    private Bitmap c(int width, int height) {
        synchronized (this.f224111d) {
            try {
                Set<Object> setKeySet = this.f224108a.keySet();
                for (Object obj : setKeySet) {
                    Bitmap bitmapB = this.f224112e.b(obj);
                    if (bitmapB != null && bitmapB.getWidth() == width && bitmapB.getHeight() == height && this.f224108a.get(obj).intValue() < 1) {
                        this.f224109b.remove(bitmapB.hashCode());
                        this.f224108a.remove(obj);
                        this.f224112e.c(obj);
                        return bitmapB;
                    }
                }
                try {
                    return td.a.f380845a.b(width, height, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError unused) {
                    synchronized (this.f224111d) {
                        try {
                            this.f224110c.clear();
                            for (Object obj2 : setKeySet) {
                                if (this.f224108a.get(obj2).intValue() < 1) {
                                    this.f224110c.add(obj2);
                                }
                            }
                            boolean zIsEmpty = this.f224110c.isEmpty();
                            if (!zIsEmpty) {
                                for (Object obj3 : this.f224110c) {
                                    this.f224108a.remove(obj3);
                                    this.f224112e.c(obj3);
                                }
                            }
                            if (zIsEmpty) {
                                return null;
                            }
                            try {
                                return td.a.f380845a.b(width, height, Bitmap.Config.ARGB_8888);
                            } catch (OutOfMemoryError unused2) {
                                return null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private Object f(Object key) {
        synchronized (this.f224111d) {
            try {
                for (Object obj : this.f224108a.keySet()) {
                    if (obj != null && obj.equals(key)) {
                        return obj;
                    }
                }
                return key;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void h(Object key, int delta) {
        if (key == null) {
            return;
        }
        synchronized (this.f224111d) {
            try {
                if (!this.f224108a.containsKey(key)) {
                    this.f224108a.put(key, 0);
                }
                HashMap<Object, Integer> map = this.f224108a;
                map.put(key, Integer.valueOf(map.get(key).intValue() + delta));
            } finally {
            }
        }
    }

    public void a() {
        synchronized (this.f224111d) {
            try {
                this.f224112e.a();
                this.f224108a.clear();
                this.f224109b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Bitmap b(int width, int height) {
        for (int i10 = 0; i10 < 10; i10++) {
            Bitmap bitmapC = c(width, height);
            if (bitmapC != null) {
                return bitmapC;
            }
            o3.c(75L);
        }
        return null;
    }

    public void d(Bitmap bitmap) {
        if (bitmap != null) {
            h(this.f224109b.get(bitmap.hashCode()), -1);
        }
    }

    public Bitmap e(Object key) {
        Bitmap bitmapB;
        synchronized (this.f224111d) {
            try {
                b<Object> bVar = this.f224112e;
                Object objF = f(key);
                bitmapB = bVar.b(objF);
                if (bitmapB != null) {
                    h(objF, 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmapB;
    }

    public void g(Object key, Bitmap bitmap) {
        synchronized (this.f224111d) {
            b<Object> bVar = this.f224112e;
            Object objF = f(key);
            bVar.d(objF, bitmap);
            this.f224109b.put(bitmap.hashCode(), objF);
            h(objF, 1);
        }
    }
}
