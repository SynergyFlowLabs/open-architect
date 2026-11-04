package androidx.core.transition;

import android.transition.Transition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,69:1\n47#1,9:70\n66#1,2:79\n47#1,9:81\n66#1,2:90\n47#1,9:92\n66#1,2:101\n47#1,9:103\n66#1,2:112\n47#1,9:114\n66#1,2:123\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n24#1:70,9\n24#1:79,2\n29#1:81,9\n29#1:90,2\n34#1:92,9\n34#1:101,2\n39#1:103,9\n39#1:112,2\n44#1:114,9\n44#1:123,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: androidx.core.transition.a$a, reason: collision with other inner class name */
    public static final class C0408a extends l0 implements Function1<Transition, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0408a f48350a = new C0408a();

        public C0408a() {
            super(1);
        }

        public final void c(Transition transition) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            c(transition);
            return Unit.f312394a;
        }
    }

    public static final class b extends l0 implements Function1<Transition, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48351a = new b();

        public b() {
            super(1);
        }

        public final void c(Transition transition) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            c(transition);
            return Unit.f312394a;
        }
    }

    public static final class c extends l0 implements Function1<Transition, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f48352a = new c();

        public c() {
            super(1);
        }

        public final void c(Transition transition) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            c(transition);
            return Unit.f312394a;
        }
    }

    public static final class d extends l0 implements Function1<Transition, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f48353a = new d();

        public d() {
            super(1);
        }

        public final void c(Transition transition) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            c(transition);
            return Unit.f312394a;
        }
    }

    public static final class e extends l0 implements Function1<Transition, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f48354a = new e();

        public e() {
            super(1);
        }

        public final void c(Transition transition) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            c(transition);
            return Unit.f312394a;
        }
    }

    public static final class f implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Transition, Unit> f48355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Transition, Unit> f48356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Transition, Unit> f48357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Transition, Unit> f48358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Transition, Unit> f48359e;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super Transition, Unit> function1, Function1<? super Transition, Unit> function2, Function1<? super Transition, Unit> function3, Function1<? super Transition, Unit> function4, Function1<? super Transition, Unit> function5) {
            this.f48355a = function1;
            this.f48356b = function2;
            this.f48357c = function3;
            this.f48358d = function4;
            this.f48359e = function5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.f48358d.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f48355a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f48357c.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f48356b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.f48359e.invoke(transition);
        }
    }

    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n51#3:66\n52#4:67\n49#5:68\n*E\n"})
    public static final class g implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f48360a;

        public g(Function1 function1) {
            this.f48360a = function1;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.f48360a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n51#2:65\n52#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class h implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f48361a;

        public h(Function1 function1) {
            this.f48361a = function1;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f48361a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n51#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class i implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f48362a;

        public i(Function1 function1) {
            this.f48362a = function1;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f48362a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n52#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class j implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f48363a;

        public j(Function1 function1) {
            this.f48363a = function1;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f48363a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n*L\n1#1,64:1\n48#2:65\n51#3:66\n52#4:67\n50#5:68\n*E\n"})
    public static final class k implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f48364a;

        public k(Function1 function1) {
            this.f48364a = function1;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.f48364a.invoke(transition);
        }
    }

    @NotNull
    public static final Transition.TransitionListener a(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1, @NotNull Function1<? super Transition, Unit> function2, @NotNull Function1<? super Transition, Unit> function3, @NotNull Function1<? super Transition, Unit> function4, @NotNull Function1<? super Transition, Unit> function5) {
        f fVar = new f(function1, function4, function5, function3, function2);
        transition.addListener(fVar);
        return fVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = C0408a.f48350a;
        }
        if ((i10 & 2) != 0) {
            function2 = b.f48351a;
        }
        Function1 function6 = function2;
        if ((i10 & 4) != 0) {
            function3 = c.f48352a;
        }
        if ((i10 & 8) != 0) {
            function4 = d.f48353a;
        }
        if ((i10 & 16) != 0) {
            function5 = e.f48354a;
        }
        f fVar = new f(function1, function4, function5, function3, function6);
        transition.addListener(fVar);
        return fVar;
    }

    @NotNull
    public static final Transition.TransitionListener c(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
        g gVar = new g(function1);
        transition.addListener(gVar);
        return gVar;
    }

    @NotNull
    public static final Transition.TransitionListener d(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
        h hVar = new h(function1);
        transition.addListener(hVar);
        return hVar;
    }

    @NotNull
    public static final Transition.TransitionListener e(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
        i iVar = new i(function1);
        transition.addListener(iVar);
        return iVar;
    }

    @NotNull
    public static final Transition.TransitionListener f(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
        j jVar = new j(function1);
        transition.addListener(jVar);
        return jVar;
    }

    @NotNull
    public static final Transition.TransitionListener g(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1) {
        k kVar = new k(function1);
        transition.addListener(kVar);
        return kVar;
    }
}
