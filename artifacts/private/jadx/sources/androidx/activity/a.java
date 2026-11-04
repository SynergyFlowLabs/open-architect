package androidx.activity;

import androidx.lifecycle.f2;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.activity.a$a, reason: collision with other inner class name */
    public static final class C0022a extends kotlin.jvm.internal.l0 implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0022a(l lVar) {
            super(0);
            this.f9785a = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return this.f9785a.getViewModelStore();
        }
    }

    public static final class b extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super(0);
            this.f9786a = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            return this.f9786a.getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends kotlin.jvm.internal.l0 implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9787a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar) {
            super(0);
            this.f9787a = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return this.f9787a.getViewModelStore();
        }
    }

    public static final class d extends kotlin.jvm.internal.l0 implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<v2.a> f9788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f9789b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<? extends v2.a> function0, l lVar) {
            super(0);
            this.f9788a = function0;
            this.f9789b = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            v2.a aVarInvoke;
            Function0<v2.a> function0 = this.f9788a;
            if (function0 != null && (aVarInvoke = function0.invoke()) != null) {
                return aVarInvoke;
            }
            return this.f9789b.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends kotlin.jvm.internal.l0 implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f9790a = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f9790a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends kotlin.jvm.internal.l0 implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9791a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar) {
            super(0);
            this.f9791a = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f9791a.getDefaultViewModelProviderFactory();
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends f2> kotlin.f0<VM> a(l lVar, Function0<? extends j2.c> function0) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (function0 == null) {
            function0 = new e(lVar);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new i2(j1.d(f2.class), new C0022a(lVar), function0, new b(lVar));
    }

    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends f2> kotlin.f0<VM> b(l lVar, Function0<? extends v2.a> function0, Function0<? extends j2.c> function1) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (function1 == null) {
            function1 = new f(lVar);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new i2(j1.d(f2.class), new c(lVar), function1, new d(function0, lVar));
    }

    public static /* synthetic */ kotlin.f0 c(l lVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (function0 == null) {
            function0 = new e(lVar);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new i2(j1.d(f2.class), new C0022a(lVar), function0, new b(lVar));
    }

    public static /* synthetic */ kotlin.f0 d(l lVar, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (function1 == null) {
            function1 = new f(lVar);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new i2(j1.d(f2.class), new c(lVar), function1, new d(function0, lVar));
    }
}
