package androidx.core.animation;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n85#1,18:124\n85#1,18:142\n85#1,18:160\n85#1,18:178\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n29#1:124,18\n39#1:142,18\n49#1:160,18\n58#1:178,18\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: androidx.core.animation.a$a, reason: collision with other inner class name */
    public static final class C0372a extends l0 implements Function1<Animator, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0372a f46873a = new C0372a();

        public C0372a() {
            super(1);
        }

        public final void c(Animator animator) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            c(animator);
            return Unit.f312394a;
        }
    }

    public static final class b extends l0 implements Function1<Animator, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46874a = new b();

        public b() {
            super(1);
        }

        public final void c(Animator animator) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            c(animator);
            return Unit.f312394a;
        }
    }

    public static final class c extends l0 implements Function1<Animator, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46875a = new c();

        public c() {
            super(1);
        }

        public final void c(Animator animator) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            c(animator);
            return Unit.f312394a;
        }
    }

    public static final class d extends l0 implements Function1<Animator, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f46876a = new d();

        public d() {
            super(1);
        }

        public final void c(Animator animator) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            c(animator);
            return Unit.f312394a;
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Animator, Unit> f46877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Animator, Unit> f46878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Animator, Unit> f46879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Animator, Unit> f46880d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2, Function1<? super Animator, Unit> function3, Function1<? super Animator, Unit> function4) {
            this.f46877a = function1;
            this.f46878b = function2;
            this.f46879c = function3;
            this.f46880d = function4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f46879c.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46878b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f46877a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46880d.invoke(animator);
        }
    }

    static final class f extends l0 implements Function1<Animator, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f46881a = new f();

        f() {
            super(1);
        }

        public final void c(Animator animator) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            c(animator);
            return Unit.f312394a;
        }
    }

    static final class g extends l0 implements Function1<Animator, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f46882a = new g();

        g() {
            super(1);
        }

        public final void c(Animator animator) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
            c(animator);
            return Unit.f312394a;
        }
    }

    public static final class h implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Animator, Unit> f46883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Animator, Unit> f46884b;

        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2) {
            this.f46883a = function1;
            this.f46884b = function2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f46883a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f46884b.invoke(animator);
        }
    }

    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n86#3:101\n87#4:102\n*E\n"})
    public static final class i implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f46885a;

        public i(Function1 function1) {
            this.f46885a = function1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f46885a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n88#3:101\n87#4:102\n*E\n"})
    public static final class j implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f46886a;

        public j(Function1 function1) {
            this.f46886a = function1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46886a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n86#2:100\n88#3:101\n87#4:102\n*E\n"})
    public static final class k implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f46887a;

        public k(Function1 function1) {
            this.f46887a = function1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f46887a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,99:1\n89#2:100\n86#3:101\n88#4:102\n*E\n"})
    public static final class l implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f46888a;

        public l(Function1 function1) {
            this.f46888a = function1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46888a.invoke(animator);
        }
    }

    @NotNull
    public static final Animator.AnimatorListener a(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1, @NotNull Function1<? super Animator, Unit> function2, @NotNull Function1<? super Animator, Unit> function3, @NotNull Function1<? super Animator, Unit> function4) {
        e eVar = new e(function4, function1, function3, function2);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = C0372a.f46873a;
        }
        if ((i10 & 2) != 0) {
            function2 = b.f46874a;
        }
        if ((i10 & 4) != 0) {
            function3 = c.f46875a;
        }
        if ((i10 & 8) != 0) {
            function4 = d.f46876a;
        }
        e eVar = new e(function4, function1, function3, function2);
        animator.addListener(eVar);
        return eVar;
    }

    @NotNull
    public static final Animator.AnimatorPauseListener c(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1, @NotNull Function1<? super Animator, Unit> function2) {
        h hVar = new h(function2, function1);
        animator.addPauseListener(hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, Function1 function1, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f.f46881a;
        }
        if ((i10 & 2) != 0) {
            function2 = g.f46882a;
        }
        return c(animator, function1, function2);
    }

    @NotNull
    public static final Animator.AnimatorListener e(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
        i iVar = new i(function1);
        animator.addListener(iVar);
        return iVar;
    }

    @NotNull
    public static final Animator.AnimatorListener f(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
        j jVar = new j(function1);
        animator.addListener(jVar);
        return jVar;
    }

    @NotNull
    public static final Animator.AnimatorPauseListener g(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
        return d(animator, null, function1, 1, null);
    }

    @NotNull
    public static final Animator.AnimatorListener h(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
        k kVar = new k(function1);
        animator.addListener(kVar);
        return kVar;
    }

    @NotNull
    public static final Animator.AnimatorPauseListener i(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
        return d(animator, function1, null, 2, null);
    }

    @NotNull
    public static final Animator.AnimatorListener j(@NotNull Animator animator, @NotNull Function1<? super Animator, Unit> function1) {
        l lVar = new l(function1);
        animator.addListener(lVar);
        return lVar;
    }
}
