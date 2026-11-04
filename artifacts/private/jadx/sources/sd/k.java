package sd;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.inappmessaging.o;
import com.google.firebase.inappmessaging.q;
import com.google.firebase.inappmessaging.t;
import com.google.firebase.inappmessaging.w;
import com.planner5d.library.model.manager.statistics.events.l1;
import com.planner5d.library.model.manager.statistics.events.s3;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@ij.f
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f375974g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f375975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f375976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q f375977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final o f375978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f375979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f375980f;

    @ij.a
    public k(@NotNull final b firebaseAvailability, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher) {
        Intrinsics.checkNotNullParameter(firebaseAvailability, "firebaseAvailability");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f375975a = dialogLauncher;
        this.f375976b = new m(dialogLauncher);
        this.f375977c = new q() { // from class: sd.g
            @Override // com.google.firebase.inappmessaging.q
            public final void a(com.google.firebase.inappmessaging.model.i iVar) {
                k.g(this.f375970a, iVar);
            }
        };
        this.f375978d = new o() { // from class: sd.h
            @Override // com.google.firebase.inappmessaging.o
            public final void a(com.google.firebase.inappmessaging.model.i iVar, com.google.firebase.inappmessaging.model.a aVar) {
                k.f(this.f375971a, iVar, aVar);
            }
        };
        this.f375979e = new t() { // from class: sd.i
            @Override // com.google.firebase.inappmessaging.t
            public final void a(com.google.firebase.inappmessaging.model.i iVar) {
                k.j(this.f375972a, iVar);
            }
        };
        this.f375980f = g0.c(new Function0() { // from class: sd.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.k(firebaseAvailability);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(k kVar, com.google.firebase.inappmessaging.model.i it, com.google.firebase.inappmessaging.model.a aVar) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        kVar.l(it, s3.a.message_action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(k kVar, com.google.firebase.inappmessaging.model.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kVar.l(it, s3.a.message_dismiss);
    }

    private final com.google.firebase.inappmessaging.m i() {
        return (com.google.firebase.inappmessaging.m) this.f375980f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(k kVar, com.google.firebase.inappmessaging.model.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kVar.l(it, s3.a.message_impression);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.inappmessaging.m k(b bVar) {
        if (!bVar.c() || bVar.d() == null) {
            return null;
        }
        return w.a(com.google.firebase.d.f121972a);
    }

    private final void l(com.google.firebase.inappmessaging.model.i iVar, s3.a aVar) {
        com.google.firebase.inappmessaging.model.e eVarF = iVar.f();
        l1.f217092b.x1(aVar, eVarF != null ? eVarF.b() : null, eVarF != null ? eVarF.a() : null);
    }

    @Nullable
    public final com.google.firebase.inappmessaging.m e() {
        com.google.firebase.inappmessaging.m mVarI = i();
        if (mVarI == null) {
            return null;
        }
        mVarI.q(this.f375977c);
        mVarI.p(this.f375978d);
        mVarI.s(this.f375979e);
        return mVarI;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k h() {
        return this.f375975a;
    }

    public final void m() {
        com.google.firebase.inappmessaging.m mVarI = i();
        if (mVarI != null) {
            mVarI.v(this.f375976b);
        }
    }

    @Nullable
    public final com.google.firebase.inappmessaging.m n() {
        com.google.firebase.inappmessaging.m mVarI = i();
        if (mVarI == null) {
            return null;
        }
        mVarI.e(this.f375977c);
        mVarI.c(this.f375978d);
        mVarI.i(this.f375979e);
        return mVarI;
    }
}
