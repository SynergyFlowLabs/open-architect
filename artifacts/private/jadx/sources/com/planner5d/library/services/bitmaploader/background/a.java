package com.planner5d.library.services.bitmaploader.background;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.LongSparseArray;
import androidx.annotation.m1;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.o3;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class a implements com.planner5d.library.services.backgroundexecutor.a<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f224042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LongSparseArray<Bitmap> f224043b = new LongSparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f224044c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f224045d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final LongSparseArray<Integer> f224046e = new LongSparseArray<>();

    private com.planner5d.library.services.bitmaploader.background.postprocess.a g(Bundle bundle) {
        j jVar = new j(bundle);
        r rVar = r.className;
        r rVar2 = r.data;
        if (jVar.a(rVar, rVar2)) {
            try {
                return (com.planner5d.library.services.bitmaploader.background.postprocess.a) Class.forName(jVar.t(rVar, com.planner5d.library.model.payments.a.f222474i)).getConstructor(Bundle.class).newInstance(jVar.h(rVar2, null));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @m1
    private g h(Context context) {
        synchronized (f224045d) {
            try {
                if (f224042a == null) {
                    f224042a = new g(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f224042a;
    }

    @m1
    private d i(Context context, long messageId, int source, String uri, int width, int height, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) {
        Bitmap bitmapJ;
        long j10 = messageId;
        try {
            synchronized (f224044c) {
                try {
                    LongSparseArray<Integer> longSparseArray = f224046e;
                    if (longSparseArray.get(j10) != null) {
                        longSparseArray.remove(j10);
                        return null;
                    }
                    longSparseArray.put(j10, 1);
                    boolean z10 = false;
                    int i10 = 0;
                    boolean z11 = false;
                    while (true) {
                        if (i10 >= 10) {
                            bitmapJ = null;
                            z10 = z11;
                            break;
                        }
                        try {
                            bitmapJ = j(context, source, uri, width, height, cacheExpire, postProcess);
                            break;
                        } catch (OutOfMemoryError unused) {
                            o3.c(1000L);
                            i10++;
                            z11 = true;
                        }
                    }
                    if (bitmapJ == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Could not load image - ");
                        sb2.append(z10 ? "no memory" : "unknown");
                        throw new IOException(sb2.toString());
                    }
                    synchronized (f224044c) {
                        LongSparseArray<Integer> longSparseArray2 = f224046e;
                        Integer num = longSparseArray2.get(j10);
                        if (num == null || num.intValue() != 1) {
                            longSparseArray2.remove(j10);
                            return null;
                        }
                        f224043b.put(j10, bitmapJ);
                        longSparseArray2.put(j10, 2);
                        try {
                            return new d(j10, bitmapJ.getWidth(), bitmapJ.getHeight(), bitmapJ.getByteCount());
                        } catch (IOException e10) {
                            e = e10;
                            j10 = j10;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
                synchronized (f224044c) {
                    f224046e.remove(j10);
                }
                return new d(j10, e.getMessage());
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    @m1
    private Bitmap j(Context context, int source, String uri, int width, int height, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) throws IOException {
        Bitmap bitmapF = h(context).f(source, uri, width, height, cacheExpire);
        if (bitmapF != null && postProcess != null) {
            try {
                Bitmap bitmapB = postProcess.b(context, bitmapF);
                if (bitmapB != null && !bitmapB.equals(bitmapF)) {
                    bitmapF.recycle();
                    return bitmapB;
                }
            } catch (OutOfMemoryError e10) {
                bitmapF.recycle();
                throw e10;
            }
        }
        return bitmapF;
    }

    @Override // com.planner5d.library.services.backgroundexecutor.a
    public boolean a(com.planner5d.library.services.backgroundexecutor.e message) {
        return message instanceof d;
    }

    @Override // com.planner5d.library.services.backgroundexecutor.a
    public void b(Context context) {
        i.b(context, f224044c, f224046e, f224043b);
    }

    @Override // com.planner5d.library.services.backgroundexecutor.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(d message) {
        synchronized (f224044c) {
            try {
                LongSparseArray<Integer> longSparseArray = f224046e;
                if (longSparseArray.get(message.f224017a) == null) {
                    longSparseArray.put(message.f224017a, 3);
                    return;
                }
                if (longSparseArray.get(message.f224017a).intValue() == 2) {
                    f224043b.remove(message.f224017a);
                    longSparseArray.remove(message.f224017a);
                } else {
                    longSparseArray.put(message.f224017a, 3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.services.backgroundexecutor.a
    @m1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d c(Context context, d message) {
        return i(context, message.f224017a, message.f224056b, message.f224057c, message.f224058d, message.f224059e, message.f224060f, g(message.f224063i));
    }
}
