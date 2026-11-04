package io.noties.markwon.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes8.dex */
public class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f297656a = "%";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f297657b = "em";

    @Override // io.noties.markwon.image.i
    @NonNull
    public Rect a(@NonNull a aVar) {
        return c(aVar.c(), aVar.g().getBounds(), aVar.f(), aVar.e());
    }

    protected int b(@NonNull h.a aVar, int i10, float f10) {
        return (int) (("em".equals(aVar.f297655b) ? aVar.f297654a * f10 : aVar.f297654a) + 0.5f);
    }

    @NonNull
    protected Rect c(@p0 h hVar, @NonNull Rect rect, int i10, float f10) {
        if (hVar == null) {
            int iWidth = rect.width();
            if (iWidth > i10) {
                return new Rect(0, 0, i10, (int) ((rect.height() / (iWidth / i10)) + 0.5f));
            }
            return rect;
        }
        h.a aVar = hVar.f297652a;
        h.a aVar2 = hVar.f297653b;
        int iWidth2 = rect.width();
        int iHeight = rect.height();
        float f11 = iWidth2 / iHeight;
        if (aVar != null) {
            int iB = f297656a.equals(aVar.f297655b) ? (int) ((i10 * (aVar.f297654a / 100.0f)) + 0.5f) : b(aVar, iWidth2, f10);
            return new Rect(0, 0, iB, (aVar2 == null || f297656a.equals(aVar2.f297655b)) ? (int) ((iB / f11) + 0.5f) : b(aVar2, iHeight, f10));
        }
        if (aVar2 != null && !f297656a.equals(aVar2.f297655b)) {
            int iB2 = b(aVar2, iHeight, f10);
            rect = new Rect(0, 0, (int) ((iB2 * f11) + 0.5f), iB2);
        }
        return rect;
    }
}
