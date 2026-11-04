package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f255098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f255099b;

    private w(Object obj, c... cVarArr) {
        this.f255098a = cVarArr;
        this.f255099b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static w b(w wVar, c[] cVarArr) {
        int length;
        if (wVar != null) {
            c[] cVarArr2 = wVar.f255098a;
            if (cVarArr2.length > 0) {
                length = cVarArr2.length;
            } else {
                length = 0;
            }
        } else {
            length = 0;
        }
        c[] cVarArr3 = new c[cVarArr.length + length];
        if (length > 0) {
            c[] cVarArr4 = wVar.f255098a;
            System.arraycopy(cVarArr4, 0, cVarArr3, 0, cVarArr4.length);
        }
        System.arraycopy(cVarArr, 0, cVarArr3, length, cVarArr.length);
        return h(null, cVarArr3);
    }

    public static w c(Object obj, w wVar) {
        return h(obj, wVar.f255098a);
    }

    public static w d(Object obj, List<c> list) {
        return h(obj, (c[]) list.toArray(new c[0]));
    }

    public static w e(Object obj, c... cVarArr) {
        return h(obj, cVarArr);
    }

    public static w f(List<c> list) {
        return d(null, list);
    }

    public static w g(c... cVarArr) {
        return h(null, cVarArr);
    }

    private static w h(Object obj, c[] cVarArr) {
        if (cVarArr == null || cVarArr.length <= 0) {
            return null;
        }
        return new w(obj, cVarArr);
    }

    public boolean a(PointF pointF) {
        for (c cVar : this.f255098a) {
            if (cVar.e(pointF)) {
                return true;
            }
        }
        return false;
    }
}
