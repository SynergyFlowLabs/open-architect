package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l<CONTENT, RESULT> implements com.facebook.r<CONTENT, RESULT> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f99962g = "FacebookDialog";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Activity f99964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final h0 f99965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private List<? extends l<CONTENT, RESULT>.b> f99966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f99967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.facebook.k f99968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f99961f = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Object f99963h = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Object f99969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<CONTENT, RESULT> f99970b;

        public b(l this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f99970b = this$0;
            this.f99969a = l.f99963h;
        }

        public abstract boolean a(CONTENT content, boolean z10);

        @Nullable
        public abstract com.facebook.internal.b b(CONTENT content);

        @NotNull
        public Object c() {
            return this.f99969a;
        }

        public void d(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f99969a = obj;
        }
    }

    public static final class c extends g.a<CONTENT, com.facebook.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<CONTENT, RESULT> f99971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f99972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.facebook.k f99973c;

        c(l<CONTENT, RESULT> lVar, Object obj, com.facebook.k kVar) {
            this.f99971a = lVar;
            this.f99972b = obj;
            this.f99973c = kVar;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.facebook.k.a parseResult(int i10, @Nullable Intent intent) {
            com.facebook.k kVar = this.f99973c;
            if (kVar != null) {
                kVar.e(this.f99971a.q(), i10, intent);
            }
            return new com.facebook.k.a(this.f99971a.q(), i10, intent);
        }

        @Override // g.a
        @NotNull
        public Intent createIntent(@NotNull Context context, CONTENT content) {
            Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.internal.b bVarL = this.f99971a.l(content, this.f99972b);
            Intent intentF = bVarL == null ? null : bVarL.f();
            if (intentF != null) {
                bVarL.g();
                return intentF;
            }
            throw new com.facebook.u("Content " + content + " is not supported");
        }
    }

    protected l(@NotNull Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f99964a = activity;
        int i11 = 0 << 0;
        this.f99965b = null;
        this.f99967d = i10;
        this.f99968e = null;
    }

    private final List<l<CONTENT, RESULT>.b> i() {
        if (this.f99966c == null) {
            this.f99966c = p();
        }
        List<? extends l<CONTENT, RESULT>.b> list = this.f99966c;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.facebook.internal.b l(CONTENT content, Object obj) {
        com.facebook.internal.b bVarM;
        boolean z10 = obj == f99963h;
        Iterator<l<CONTENT, RESULT>.b> it = i().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVarM = null;
                break;
            }
            l<CONTENT, RESULT>.b next = it.next();
            if (!z10) {
                e1 e1Var = e1.f99794a;
                if (!e1.e(next.c(), obj)) {
                }
            }
            if (next.a(content, true)) {
                try {
                    bVarM = next.b(content);
                    break;
                } catch (com.facebook.u e10) {
                    com.facebook.internal.b bVarM2 = m();
                    k kVar = k.f99938a;
                    k.o(bVarM2, e10);
                    bVarM = bVarM2;
                }
            }
        }
        if (bVarM == null) {
            bVarM = m();
            k kVar2 = k.f99938a;
            k.k(bVarM);
        }
        return bVarM;
    }

    private final void r(com.facebook.k kVar) {
        if (this.f99968e == null) {
            this.f99968e = kVar;
        }
    }

    @Override // com.facebook.r
    @NotNull
    public g.a<CONTENT, com.facebook.k.a> b(@Nullable com.facebook.k kVar) {
        return k(kVar, f99963h);
    }

    @Override // com.facebook.r
    public void c(CONTENT content) {
        w(content, f99963h);
    }

    @Override // com.facebook.r
    public boolean d(CONTENT content) {
        return j(content, f99963h);
    }

    @Override // com.facebook.r
    public void e(@NotNull com.facebook.k callbackManager, @NotNull com.facebook.p<RESULT> callback, int i10) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r(callbackManager);
        v(i10);
        f(callbackManager, callback);
    }

    @Override // com.facebook.r
    public void f(@NotNull com.facebook.k callbackManager, @NotNull com.facebook.p<RESULT> callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(callbackManager instanceof f)) {
            throw new com.facebook.u("Unexpected CallbackManager, please use the provided Factory.");
        }
        r(callbackManager);
        s((f) callbackManager, callback);
    }

    protected boolean j(CONTENT content, @NotNull Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z10 = mode == f99963h;
        for (l<CONTENT, RESULT>.b bVar : i()) {
            if (!z10) {
                e1 e1Var = e1.f99794a;
                if (!e1.e(bVar.c(), mode)) {
                    continue;
                }
            }
            if (bVar.a(content, false)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    protected final g.a<CONTENT, com.facebook.k.a> k(@Nullable com.facebook.k kVar, @NotNull Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new c(this, mode, kVar);
    }

    @NotNull
    protected abstract com.facebook.internal.b m();

    @Nullable
    protected final Activity n() {
        Activity activity = this.f99964a;
        if (activity != null) {
            return activity;
        }
        h0 h0Var = this.f99965b;
        if (h0Var != null) {
            return h0Var.a();
        }
        int i10 = 3 | 0;
        return null;
    }

    @androidx.annotation.l1(otherwise = 2)
    @Nullable
    public final com.facebook.k o() {
        return this.f99968e;
    }

    @NotNull
    protected abstract List<l<CONTENT, RESULT>.b> p();

    public final int q() {
        return this.f99967d;
    }

    protected abstract void s(@NotNull f fVar, @NotNull com.facebook.p<RESULT> pVar);

    public final void t(@Nullable com.facebook.k kVar) {
        this.f99968e = kVar;
    }

    public final void u(@Nullable com.facebook.k kVar) {
        this.f99968e = kVar;
    }

    public final void v(int i10) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (!com.facebook.g0.L(i10)) {
            this.f99967d = i10;
            return;
        }
        throw new IllegalArgumentException(("Request code " + i10 + " cannot be within the range reserved by the Facebook SDK.").toString());
    }

    protected void w(CONTENT content, @NotNull Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        com.facebook.internal.b bVarL = l(content, mode);
        if (bVarL == null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (com.facebook.g0.K()) {
                throw new IllegalStateException("No code path should ever result in a null appCall");
            }
            return;
        }
        if (n() instanceof androidx.activity.result.l) {
            ComponentCallbacks2 componentCallbacks2N = n();
            if (componentCallbacks2N == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
            k kVar = k.f99938a;
            androidx.activity.result.k activityResultRegistry = ((androidx.activity.result.l) componentCallbacks2N).getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "registryOwner.activityResultRegistry");
            k.i(bVarL, activityResultRegistry, this.f99968e);
            bVarL.g();
            return;
        }
        h0 h0Var = this.f99965b;
        if (h0Var != null) {
            k kVar2 = k.f99938a;
            k.j(bVarL, h0Var);
            return;
        }
        Activity activity = this.f99964a;
        if (activity != null) {
            k kVar3 = k.f99938a;
            k.h(bVarL, activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void x(@NotNull Intent intent, int i10) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Activity activityN = n();
        if (activityN instanceof androidx.activity.result.l) {
            k kVar = k.f99938a;
            androidx.activity.result.k activityResultRegistry = ((androidx.activity.result.l) activityN).getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "activity as ActivityResultRegistryOwner).activityResultRegistry");
            k.r(activityResultRegistry, this.f99968e, intent, i10);
        } else {
            if (activityN == 0) {
                h0 h0Var = this.f99965b;
                if (h0Var != null) {
                    h0Var.d(intent, i10);
                } else {
                    str = "Failed to find Activity or Fragment to startActivityForResult ";
                }
                if (str != null) {
                    t0.a aVar = t0.f100109e;
                    com.facebook.t0 t0Var = com.facebook.t0.DEVELOPER_ERRORS;
                    String name = getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "this.javaClass.name");
                    aVar.b(t0Var, 6, name, str);
                }
            }
            activityN.startActivityForResult(intent, i10);
        }
        str = null;
        if (str != null) {
            t0.a aVar2 = t0.f100109e;
            com.facebook.t0 t0Var2 = com.facebook.t0.DEVELOPER_ERRORS;
            String name2 = getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "this.javaClass.name");
            aVar2.b(t0Var2, 6, name2, str);
        }
    }

    protected l(@NotNull h0 fragmentWrapper, int i10) {
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.f99965b = fragmentWrapper;
        this.f99964a = null;
        this.f99967d = i10;
        if (fragmentWrapper.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }

    protected l(int i10) {
        this.f99967d = i10;
        int i11 = 0 >> 0;
        this.f99964a = null;
        this.f99965b = null;
    }
}
