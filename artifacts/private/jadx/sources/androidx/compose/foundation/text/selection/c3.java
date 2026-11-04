package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMode.kt\nandroidx/compose/foundation/text/selection/SelectionMode\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,111:1\n65#2:112\n69#2:115\n60#3:113\n70#3:116\n22#4:114\n*S KotlinDebug\n*F\n+ 1 SelectionMode.kt\nandroidx/compose/foundation/text/selection/SelectionMode\n*L\n109#1:112\n109#1:115\n109#1:113\n109#1:116\n109#1:114\n*E\n"})
public enum c3 {
    Vertical { // from class: androidx.compose.foundation.text.selection.c3.b
        @Override // androidx.compose.foundation.text.selection.c3
        public int l(long j10, @NotNull n0.j jVar) {
            if (n2.d(jVar, j10)) {
                return 0;
            }
            int i10 = (int) (com.rabbitmq.client.k0.f265952a & j10);
            if (Float.intBitsToFloat(i10) < jVar.B()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j10 >> 32)) >= jVar.t() || Float.intBitsToFloat(i10) >= jVar.j()) ? 1 : -1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.c3.a
        @Override // androidx.compose.foundation.text.selection.c3
        public int l(long j10, @NotNull n0.j jVar) {
            if (n2.d(jVar, j10)) {
                return 0;
            }
            int i10 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i10) < jVar.t()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) >= jVar.B() || Float.intBitsToFloat(i10) >= jVar.x()) ? 1 : -1;
        }
    };


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f21029d = kotlin.enums.c.c(k());

    /* synthetic */ c3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean n(n0.j jVar, long j10) {
        float fT = jVar.t();
        float fX = jVar.x();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (fT > fIntBitsToFloat || fIntBitsToFloat > fX) {
            return false;
        }
        float fB = jVar.B();
        float fJ = jVar.j();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        return fB <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fJ;
    }

    @NotNull
    public static kotlin.enums.a<c3> o() {
        return f21029d;
    }

    public abstract int l(long j10, @NotNull n0.j jVar);

    public final boolean p(@NotNull n0.j jVar, long j10, long j11) {
        if (n(jVar, j10) || n(jVar, j11)) {
            return true;
        }
        return (l(j10, jVar) > 0) ^ (l(j11, jVar) > 0);
    }
}
