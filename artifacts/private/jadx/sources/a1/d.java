package a1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.drawscope.m;
import androidx.compose.ui.graphics.drawscope.n;
import androidx.compose.ui.graphics.l2;
import androidx.compose.ui.graphics.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class d extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f420b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f421a;

    public d(@NotNull i iVar) {
        this.f421a = iVar;
    }

    @NotNull
    public final i a() {
        return this.f421a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint) {
        if (textPaint != null) {
            i iVar = this.f421a;
            if (Intrinsics.areEqual(iVar, m.f37744a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(iVar instanceof n)) {
                throw new k0();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((n) this.f421a).g());
            textPaint.setStrokeMiter(((n) this.f421a).e());
            textPaint.setStrokeJoin(e.b(((n) this.f421a).d()));
            textPaint.setStrokeCap(e.a(((n) this.f421a).c()));
            l2 l2VarF = ((n) this.f421a).f();
            textPaint.setPathEffect(l2VarF != null ? p.e(l2VarF) : null);
        }
    }
}
