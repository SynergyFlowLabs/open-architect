package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nColorFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorFilter.kt\nandroidx/compose/ui/graphics/ColorMatrixColorFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
public final class u0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private float[] f38248c;

    public /* synthetic */ u0(float[] fArr, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr, colorFilter);
    }

    public static /* synthetic */ float[] c(u0 u0Var, float[] fArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = t0.c(null, 1, null);
        }
        return u0Var.b(fArr);
    }

    private final float[] d() {
        float[] fArr = this.f38248c;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrB = d.b(a());
        this.f38248c = fArrB;
        return fArrB;
    }

    @NotNull
    public final float[] b(@NotNull float[] fArr) {
        ArraysKt.copyInto$default(d(), fArr, 0, 0, 0, 14, (Object) null);
        return fArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Arrays.equals(d(), ((u0) obj).d());
    }

    public int hashCode() {
        float[] fArr = this.f38248c;
        if (fArr != null) {
            return t0.j(fArr);
        }
        return 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f38248c;
        sb2.append((Object) (fArr == null ? AbstractJsonLexerKt.NULL : t0.u(fArr)));
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ u0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private u0(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.f38248c = fArr;
    }

    private u0(float[] fArr) {
        this(fArr, d.a(fArr), null);
    }
}
