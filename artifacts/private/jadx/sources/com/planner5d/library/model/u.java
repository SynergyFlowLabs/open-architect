package com.planner5d.library.model;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.c1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f222816e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f222817f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f222818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f222819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f222820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f222821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f222822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f222823l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f222824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k3 f222825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final View f222826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a[] f222827d;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f222828c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k3 f222829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f222830b;

        public a(@NotNull k3 title, @NotNull Function0<Unit> listener) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f222829a = title;
            this.f222830b = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b() {
            return Unit.f312394a;
        }

        @NotNull
        public final Function0<Unit> c() {
            return this.f222830b;
        }

        @NotNull
        public final k3 d() {
            return this.f222829a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            a aVar = obj instanceof a ? (a) obj : null;
            if (aVar != null) {
                return Intrinsics.areEqual(this.f222829a, aVar.f222829a);
            }
            return false;
        }

        public int hashCode() {
            return this.f222829a.hashCode();
        }

        public /* synthetic */ a(k3 k3Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(k3Var, (Function0<Unit>) ((i10 & 2) != 0 ? new Function0() { // from class: com.planner5d.library.model.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u.a.b();
                }
            } : function0));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull a button, @NotNull Function0<Unit> listener) {
            this(button.f222829a, listener);
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(listener, "listener");
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public enum c {
        Error(c1.g.T6, c1.e.A3),
        Info(c1.g.W7, c1.e.X3),
        Rate(c1.g.f251467f9, c1.e.Ya),
        ContestError(c1.g.T6, c1.e.A3),
        ContestVotingNotify(c1.g.f251748z6, c1.e.f250641ng),
        SnackbarSuccess(c1.g.X5, c1.e.f250347b4),
        SnackbarError(c1.g.W6, c1.e.f250431eg),
        NoNewtworkError(c1.g.T6, c1.e.f250431eg);


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f222840l = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f222841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f222842b;

        c(int i10, int i11) {
            this.f222841a = i10;
            this.f222842b = i11;
        }

        @NotNull
        public static kotlin.enums.a<c> n() {
            return f222840l;
        }

        public final int l() {
            return this.f222842b;
        }

        public final int o() {
            return this.f222841a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 2;
        f222818g = new a(new k3(c1.q.Uh, new Object[0]), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f222819h = new a(new k3(c1.q.K2, new Object[0]), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f222820i = new a(new k3(c1.q.Xf, new Object[0]), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f222821j = new a(new k3(c1.q.Yf, new Object[0]), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f222822k = new a(new k3(c1.q.K1, new Object[0]), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f222823l = new a(new k3(c1.q.lp, new Object[0]), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    public u(@NotNull c type, @NotNull k3 message, @Nullable View view, @NotNull a... buttons) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f222824a = type;
        this.f222825b = message;
        this.f222826c = view;
        this.f222827d = buttons.length == 0 ? new a[]{f222818g} : (a[]) Arrays.copyOf(buttons, buttons.length);
    }

    @Nullable
    public final View a() {
        return this.f222826c;
    }

    @NotNull
    public final a[] b() {
        return this.f222827d;
    }

    @NotNull
    public final k3 c() {
        return this.f222825b;
    }

    @NotNull
    public final c d() {
        return this.f222824a;
    }

    @NotNull
    public final u e(@NotNull a... buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new u(this.f222824a, this.f222825b, (a[]) Arrays.copyOf(buttons, buttons.length));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        u uVar = obj instanceof u ? (u) obj : null;
        return uVar != null && this.f222824a == uVar.f222824a && Intrinsics.areEqual(this.f222825b, uVar.f222825b) && Arrays.equals(this.f222827d, uVar.f222827d);
    }

    public int hashCode() {
        return (((this.f222824a.hashCode() * 31) + this.f222825b.hashCode()) * 31) + Arrays.hashCode(this.f222827d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull c type, @NotNull k3 message, @NotNull a... buttons) {
        this(type, message, null, (a[]) Arrays.copyOf(buttons, buttons.length));
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
    }
}
