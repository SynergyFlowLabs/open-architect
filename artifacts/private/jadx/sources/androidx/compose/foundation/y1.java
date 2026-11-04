package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1073:1\n1#2:1074\n54#3:1075\n59#3:1077\n59#3:1079\n54#3:1081\n54#3:1083\n59#3:1085\n54#3:1087\n59#3:1089\n59#3:1091\n54#3:1093\n59#3:1095\n54#3:1097\n54#3:1099\n59#3:1101\n54#3:1103\n59#3:1105\n59#3:1107\n54#3:1109\n59#3:1111\n54#3:1113\n85#4:1076\n90#4:1078\n90#4:1080\n85#4:1082\n85#4:1084\n90#4:1086\n85#4:1088\n90#4:1090\n90#4:1092\n85#4:1094\n90#4:1096\n85#4:1098\n85#4:1100\n90#4:1102\n85#4:1104\n90#4:1106\n90#4:1108\n85#4:1110\n90#4:1112\n85#4:1114\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n*L\n1034#1:1075\n1034#1:1077\n1036#1:1079\n1036#1:1081\n1043#1:1083\n1043#1:1085\n1044#1:1087\n1044#1:1089\n1045#1:1091\n1045#1:1093\n1046#1:1095\n1046#1:1097\n1048#1:1099\n1048#1:1101\n1049#1:1103\n1049#1:1105\n1050#1:1107\n1050#1:1109\n1051#1:1111\n1051#1:1113\n1034#1:1076\n1034#1:1078\n1036#1:1080\n1036#1:1082\n1043#1:1084\n1043#1:1086\n1044#1:1088\n1044#1:1090\n1045#1:1092\n1045#1:1094\n1046#1:1096\n1046#1:1098\n1048#1:1100\n1048#1:1102\n1049#1:1104\n1049#1:1106\n1050#1:1108\n1050#1:1110\n1051#1:1112\n1051#1:1114\n*E\n"})
final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f21909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21911c = androidx.compose.ui.unit.u.f42720b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private EdgeEffect f21919k;

    public y1(@NotNull Context context, @androidx.annotation.l int i10) {
        this.f21909a = context;
        this.f21910b = i10;
    }

    private final EdgeEffect e(androidx.compose.foundation.gestures.q3 q3Var) {
        EdgeEffect edgeEffectB = w1.f21865a.b(this.f21909a);
        edgeEffectB.setColor(this.f21910b);
        if (!androidx.compose.ui.unit.u.h(this.f21911c, androidx.compose.ui.unit.u.f42720b.a())) {
            if (q3Var == androidx.compose.foundation.gestures.q3.Vertical) {
                long j10 = this.f21911c;
                edgeEffectB.setSize((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a));
                return edgeEffectB;
            }
            long j11 = this.f21911c;
            edgeEffectB.setSize((int) (j11 & com.rabbitmq.client.k0.f265952a), (int) (j11 >> 32));
        }
        return edgeEffectB;
    }

    private final boolean p(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean z(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(w1.f21865a.c(edgeEffect) == 0.0f);
    }

    public final boolean A() {
        return p(this.f21912d);
    }

    public final boolean B() {
        return z(this.f21916h);
    }

    public final boolean C() {
        return z(this.f21912d);
    }

    public final void D(long j10) {
        this.f21911c = j10;
        EdgeEffect edgeEffect = this.f21912d;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a));
        }
        EdgeEffect edgeEffect2 = this.f21913e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a));
        }
        EdgeEffect edgeEffect3 = this.f21914f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j10 & com.rabbitmq.client.k0.f265952a), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect4 = this.f21915g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j10 & com.rabbitmq.client.k0.f265952a), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect5 = this.f21916h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a));
        }
        EdgeEffect edgeEffect6 = this.f21917i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a));
        }
        EdgeEffect edgeEffect7 = this.f21918j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j10 & com.rabbitmq.client.k0.f265952a), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect8 = this.f21919k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (j10 & com.rabbitmq.client.k0.f265952a), (int) (j10 >> 32));
        }
    }

    public final void f() {
        EdgeEffect edgeEffect = this.f21912d;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.f21913e;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.f21914f;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.f21915g;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.f21916h;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.f21917i;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.f21918j;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.f21919k;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final void g(@NotNull Function1<? super EdgeEffect, Unit> function1) {
        EdgeEffect edgeEffect = this.f21912d;
        if (edgeEffect != null) {
            function1.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.f21913e;
        if (edgeEffect2 != null) {
            function1.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.f21914f;
        if (edgeEffect3 != null) {
            function1.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.f21915g;
        if (edgeEffect4 != null) {
            function1.invoke(edgeEffect4);
        }
    }

    @NotNull
    public final EdgeEffect h() {
        EdgeEffect edgeEffectE = this.f21913e;
        if (edgeEffectE == null) {
            edgeEffectE = e(androidx.compose.foundation.gestures.q3.Vertical);
            this.f21913e = edgeEffectE;
        }
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f21917i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(androidx.compose.foundation.gestures.q3.Vertical);
        this.f21917i = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f21914f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(androidx.compose.foundation.gestures.q3.Horizontal);
        this.f21914f = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f21918j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(androidx.compose.foundation.gestures.q3.Horizontal);
        this.f21918j = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f21915g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(androidx.compose.foundation.gestures.q3.Horizontal);
        this.f21915g = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f21919k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(androidx.compose.foundation.gestures.q3.Horizontal);
        this.f21919k = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect n() {
        EdgeEffect edgeEffect = this.f21912d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(androidx.compose.foundation.gestures.q3.Vertical);
        this.f21912d = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect o() {
        EdgeEffect edgeEffect = this.f21916h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(androidx.compose.foundation.gestures.q3.Vertical);
        this.f21916h = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean q() {
        return p(this.f21913e);
    }

    public final boolean r() {
        return z(this.f21917i);
    }

    public final boolean s() {
        return z(this.f21913e);
    }

    public final boolean t() {
        return p(this.f21914f);
    }

    public final boolean u() {
        return z(this.f21918j);
    }

    public final boolean v() {
        return z(this.f21914f);
    }

    public final boolean w() {
        return p(this.f21915g);
    }

    public final boolean x() {
        return z(this.f21919k);
    }

    public final boolean y() {
        return z(this.f21915g);
    }
}
