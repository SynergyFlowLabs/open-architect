package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.u1;
import androidx.core.view.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1176:1\n288#2,2:1177\n533#2,6:1179\n1360#2:1185\n1446#2,5:1186\n819#2:1191\n847#2,2:1192\n766#2:1194\n857#2,2:1195\n1789#2,3:1197\n1726#2,3:1200\n1855#2,2:1203\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n55#1:1177,2\n61#1:1179,6\n120#1:1185\n120#1:1186,5\n193#1:1191\n193#1:1192,2\n196#1:1194\n196#1:1195,2\n200#1:1197,3\n358#1:1200,3\n369#1:1203,2\n*E\n"})
public final class d extends f1 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends f1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final b f51790d;

        /* JADX INFO: renamed from: androidx.fragment.app.d$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0466a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1.d f51791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f51792b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f51793c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f51794d;

            AnimationAnimationListenerC0466a(f1.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f51791a = dVar;
                this.f51792b = viewGroup;
                this.f51793c = view;
                this.f51794d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup container, View view, a this$0) {
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition(view);
                this$0.h().a().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                final ViewGroup viewGroup = this.f51792b;
                final View view = this.f51793c;
                final a aVar = this.f51794d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.AnimationAnimationListenerC0466a.b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.b1(2)) {
                    Objects.toString(this.f51791a);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (FragmentManager.b1(2)) {
                    Objects.toString(this.f51791a);
                }
            }
        }

        public a(@NotNull b animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.f51790d = animationInfo;
        }

        @Override // androidx.fragment.app.f1.b
        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            f1.d dVarA = this.f51790d.a();
            View view = dVarA.h().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f51790d.a().e(this);
            if (FragmentManager.b1(2)) {
                dVarA.toString();
            }
        }

        @Override // androidx.fragment.app.f1.b
        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.f51790d.b()) {
                this.f51790d.a().e(this);
                return;
            }
            Context context = container.getContext();
            f1.d dVarA = this.f51790d.a();
            View view = dVarA.h().mView;
            b bVar = this.f51790d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            t.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f51973a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dVarA.g() != f1.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f51790d.a().e(this);
                return;
            }
            container.startViewTransition(view);
            t.b bVar2 = new t.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0466a(dVarA, container, view, this));
            view.startAnimation(bVar2);
            if (FragmentManager.b1(2)) {
                dVarA.toString();
            }
        }

        @NotNull
        public final b h() {
            return this.f51790d;
        }
    }

    private static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f51795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f51796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private t.a f51797d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull f1.d operation, boolean z10) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f51795b = z10;
        }

        @Nullable
        public final t.a c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f51796c) {
                return this.f51797d;
            }
            t.a aVarB = t.b(context, a().h(), a().g() == f1.d.b.VISIBLE, this.f51795b);
            this.f51797d = aVarB;
            this.f51796c = true;
            return aVarB;
        }
    }

    private static final class c extends f1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final b f51798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private AnimatorSet f51799e;

        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f51800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f51801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f51802c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f1.d f51803d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f51804e;

            a(ViewGroup viewGroup, View view, boolean z10, f1.d dVar, c cVar) {
                this.f51800a = viewGroup;
                this.f51801b = view;
                this.f51802c = z10;
                this.f51803d = dVar;
                this.f51804e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                this.f51800a.endViewTransition(this.f51801b);
                if (this.f51802c) {
                    f1.d.b bVarG = this.f51803d.g();
                    View viewToAnimate = this.f51801b;
                    Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                    bVarG.l(viewToAnimate, this.f51800a);
                }
                this.f51804e.i().a().e(this.f51804e);
                if (FragmentManager.b1(2)) {
                    Objects.toString(this.f51803d);
                }
            }
        }

        public c(@NotNull b animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.f51798d = animatorInfo;
        }

        @Override // androidx.fragment.app.f1.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.f1.b
        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.f51799e;
            if (animatorSet == null) {
                this.f51798d.a().e(this);
                return;
            }
            f1.d dVarA = this.f51798d.a();
            if (dVarA.m()) {
                e.f51806a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.b1(2)) {
                dVarA.toString();
                dVarA.m();
            }
        }

        @Override // androidx.fragment.app.f1.b
        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            f1.d dVarA = this.f51798d.a();
            AnimatorSet animatorSet = this.f51799e;
            if (animatorSet == null) {
                this.f51798d.a().e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.b1(2)) {
                Objects.toString(dVarA);
            }
        }

        @Override // androidx.fragment.app.f1.b
        public void e(@NotNull androidx.activity.d backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            f1.d dVarA = this.f51798d.a();
            AnimatorSet animatorSet = this.f51799e;
            if (animatorSet == null) {
                this.f51798d.a().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVarA.h().mTransitioning) {
                return;
            }
            if (FragmentManager.b1(2)) {
                dVarA.toString();
            }
            long jA = C0467d.f51805a.a(animatorSet);
            long jA2 = (long) (backEvent.a() * jA);
            if (jA2 == 0) {
                jA2 = 1;
            }
            if (jA2 == jA) {
                jA2 = jA - 1;
            }
            if (FragmentManager.b1(2)) {
                animatorSet.toString();
                dVarA.toString();
            }
            e.f51806a.b(animatorSet, jA2);
        }

        @Override // androidx.fragment.app.f1.b
        public void f(@NotNull ViewGroup container) {
            c cVar;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.f51798d.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.f51798d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            t.a aVarC = bVar.c(context);
            this.f51799e = aVarC != null ? aVarC.f51974b : null;
            f1.d dVarA = this.f51798d.a();
            Fragment fragmentH = dVarA.h();
            boolean z10 = dVarA.g() == f1.d.b.GONE;
            View view = fragmentH.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f51799e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z10, dVarA, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f51799e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        @Nullable
        public final AnimatorSet h() {
            return this.f51799e;
        }

        @NotNull
        public final b i() {
            return this.f51798d;
        }

        public final void j(@Nullable AnimatorSet animatorSet) {
            this.f51799e = animatorSet;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    @androidx.annotation.w0(24)
    public static final class C0467d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0467d f51805a = new C0467d();

        private C0467d() {
        }

        @androidx.annotation.u
        public final long a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    @androidx.annotation.w0(26)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f51806a = new e();

        private e() {
        }

        @androidx.annotation.u
        public final void a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @androidx.annotation.u
        public final void b(@NotNull AnimatorSet animatorSet, long j10) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final f1.d f51807a;

        public f(@NotNull f1.d operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f51807a = operation;
        }

        @NotNull
        public final f1.d a() {
            return this.f51807a;
        }

        public final boolean b() {
            View view = this.f51807a.h().mView;
            f1.d.b bVarA = view != null ? f1.d.b.f51877a.a(view) : null;
            f1.d.b bVarG = this.f51807a.g();
            if (bVarA == bVarG) {
                return true;
            }
            f1.d.b bVar = f1.d.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1176:1\n1726#2,3:1177\n1726#2,3:1180\n1855#2,2:1183\n1549#2:1185\n1620#2,3:1186\n1855#2,2:1189\n1855#2,2:1192\n1549#2:1194\n1620#2,3:1195\n1855#2,2:1198\n1#3:1191\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n*L\n726#1:1177,3\n735#1:1180,3\n743#1:1183,2\n772#1:1185\n772#1:1186,3\n772#1:1189,2\n857#1:1192,2\n889#1:1194\n889#1:1195,3\n889#1:1198,2\n*E\n"})
    static final class g extends f1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<h> f51808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final f1.d f51809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final f1.d f51810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final x0 f51811g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private final Object f51812h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final ArrayList<View> f51813i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final ArrayList<View> f51814j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private final androidx.collection.a<String, String> f51815k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private final ArrayList<String> f51816l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private final ArrayList<String> f51817m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private final androidx.collection.a<String, View> f51818n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        private final androidx.collection.a<String, View> f51819o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f51820p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        private final androidx.core.os.f f51821q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        private Object f51822r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f51823s;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f51825b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f51826c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f51825b = viewGroup;
                this.f51826c = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                g.this.E().e(this.f51825b, this.f51826c);
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f51828b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f51829c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<Function0<Unit>> f51830d;

            @SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1176:1\n1726#2,3:1177\n1855#2,2:1180\n1855#2,2:1182\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1\n*L\n806#1:1177,3\n811#1:1180,2\n836#1:1182,2\n*E\n"})
            static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f51831a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f51832b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ViewGroup f51833c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f51831a = gVar;
                    this.f51832b = obj;
                    this.f51833c = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void f(g this$0, ViewGroup container) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(container, "$container");
                    Iterator<T> it = this$0.F().iterator();
                    while (it.hasNext()) {
                        f1.d dVarA = ((h) it.next()).a();
                        View view = dVarA.h().getView();
                        if (view != null) {
                            dVarA.g().l(view, container);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void i(g this$0) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    int i10 = 7 ^ 2;
                    FragmentManager.b1(2);
                    Iterator<T> it = this$0.F().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a().e(this$0);
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    List<h> listF = this.f51831a.F();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).a().m()) {
                                FragmentManager.b1(2);
                                androidx.core.os.f fVar = new androidx.core.os.f();
                                x0 x0VarE = this.f51831a.E();
                                Fragment fragmentH = this.f51831a.F().get(0).a().h();
                                Object obj = this.f51832b;
                                final g gVar = this.f51831a;
                                x0VarE.y(fragmentH, obj, fVar, new Runnable() { // from class: androidx.fragment.app.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        d.g.b.a.i(gVar);
                                    }
                                });
                                fVar.a();
                                return;
                            }
                        }
                    }
                    FragmentManager.b1(2);
                    x0 x0VarE2 = this.f51831a.E();
                    Object objS = this.f51831a.s();
                    Intrinsics.checkNotNull(objS);
                    final g gVar2 = this.f51831a;
                    final ViewGroup viewGroup = this.f51833c;
                    x0VarE2.d(objS, new Runnable() { // from class: androidx.fragment.app.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.g.b.a.f(gVar2, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, kotlin.jvm.internal.i1.h<Function0<Unit>> hVar) {
                super(0);
                this.f51828b = viewGroup;
                this.f51829c = obj;
                this.f51830d = hVar;
                int i10 = 6 | 0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.d$g$b$a] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentManager.b1(2);
                g gVar = g.this;
                gVar.O(gVar.E().j(this.f51828b, this.f51829c));
                if (g.this.s() == null) {
                    FragmentManager.b1(2);
                    g.this.P(true);
                    return;
                }
                this.f51830d.f312751a = new a(g.this, this.f51829c, this.f51828b);
                if (FragmentManager.b1(2)) {
                    Objects.toString(g.this.v());
                    Objects.toString(g.this.x());
                }
            }
        }

        public g(@NotNull List<h> transitionInfos, @Nullable f1.d dVar, @Nullable f1.d dVar2, @NotNull x0 transitionImpl, @Nullable Object obj, @NotNull ArrayList<View> sharedElementFirstOutViews, @NotNull ArrayList<View> sharedElementLastInViews, @NotNull androidx.collection.a<String, String> sharedElementNameMapping, @NotNull ArrayList<String> enteringNames, @NotNull ArrayList<String> exitingNames, @NotNull androidx.collection.a<String, View> firstOutViews, @NotNull androidx.collection.a<String, View> lastInViews, boolean z10) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.f51808d = transitionInfos;
            this.f51809e = dVar;
            this.f51810f = dVar2;
            this.f51811g = transitionImpl;
            this.f51812h = obj;
            this.f51813i = sharedElementFirstOutViews;
            this.f51814j = sharedElementLastInViews;
            this.f51815k = sharedElementNameMapping;
            this.f51816l = enteringNames;
            this.f51817m = exitingNames;
            this.f51818n = firstOutViews;
            this.f51819o = lastInViews;
            this.f51820p = z10;
            this.f51821q = new androidx.core.os.f();
        }

        public static /* synthetic */ void H() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void K(f1.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.b1(2)) {
                Objects.toString(operation);
            }
            operation.e(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void L(kotlin.jvm.internal.i1.h seekCancelLambda) {
            Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.f312751a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void M(f1.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (FragmentManager.b1(2)) {
                Objects.toString(operation);
            }
            operation.e(this$0);
        }

        private final void N(ArrayList<View> arrayList, ViewGroup viewGroup, Function0<Unit> function0) {
            v0.e(arrayList, 4);
            ArrayList<String> arrayListQ = this.f51811g.q(this.f51814j);
            if (FragmentManager.b1(2)) {
                for (View sharedElementFirstOutViews : this.f51813i) {
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Objects.toString(view);
                    u1.A0(view);
                }
                for (View sharedElementLastInViews : this.f51814j) {
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Objects.toString(view2);
                    u1.A0(view2);
                }
            }
            function0.invoke();
            this.f51811g.A(viewGroup, this.f51813i, this.f51814j, arrayListQ, this.f51815k);
            v0.e(arrayList, 0);
            this.f51811g.C(this.f51812h, this.f51813i, this.f51814j);
        }

        private final void n(ArrayList<View> arrayList, View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z1.c(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View child = viewGroup.getChildAt(i10);
                        if (child.getVisibility() == 0) {
                            Intrinsics.checkNotNullExpressionValue(child, "child");
                            n(arrayList, child);
                        }
                    }
                } else if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }

        private final Pair<ArrayList<View>, Object> o(ViewGroup viewGroup, final f1.d dVar, final f1.d dVar2) {
            dVar = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.f51808d.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && dVar2 != null && dVar != null && !this.f51815k.isEmpty() && this.f51812h != null) {
                    v0.a(dVar.h(), dVar2.h(), this.f51820p, this.f51818n, true);
                    androidx.core.view.e1.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.g.p(dVar, dVar2, this);
                        }
                    });
                    this.f51813i.addAll(this.f51818n.values());
                    if (!this.f51817m.isEmpty()) {
                        String str = this.f51817m.get(0);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[0]");
                        view2 = this.f51818n.get(str);
                        this.f51811g.x(this.f51812h, view2);
                    }
                    this.f51814j.addAll(this.f51819o.values());
                    if (!this.f51816l.isEmpty()) {
                        String str2 = this.f51816l.get(0);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[0]");
                        final View view3 = this.f51819o.get(str2);
                        if (view3 != null) {
                            final x0 x0Var = this.f51811g;
                            androidx.core.view.e1.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    d.g.q(x0Var, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.f51811g.B(this.f51812h, view, this.f51813i);
                    x0 x0Var2 = this.f51811g;
                    Object obj = this.f51812h;
                    x0Var2.u(obj, null, null, null, null, obj, this.f51814j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.f51808d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                f1.d dVarA = next.a();
                Object objH = this.f51811g.h(next.f());
                if (objH != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    boolean z11 = z10;
                    View view4 = dVarA.h().mView;
                    Iterator<h> it3 = it2;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f51812h != null && (dVarA == dVar2 || dVarA == dVar)) {
                        if (dVarA == dVar2) {
                            arrayList2.removeAll(CollectionsKt.toSet(this.f51813i));
                        } else {
                            arrayList2.removeAll(CollectionsKt.toSet(this.f51814j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f51811g.a(objH, view);
                    } else {
                        this.f51811g.b(objH, arrayList2);
                        this.f51811g.u(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.g() == f1.d.b.GONE) {
                            dVarA.q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(dVarA.h().mView);
                            this.f51811g.t(objH, dVarA.h().mView, arrayList3);
                            androidx.core.view.e1.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    d.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.g() == f1.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.f51811g.w(objH, rect);
                        }
                        if (FragmentManager.b1(2)) {
                            objH.toString();
                            for (View transitioningViews : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Objects.toString(transitioningViews);
                            }
                        }
                    } else {
                        this.f51811g.x(objH, view2);
                        if (FragmentManager.b1(2)) {
                            objH.toString();
                            for (View transitioningViews2 : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Objects.toString(transitioningViews2);
                            }
                        }
                    }
                    if (next.h()) {
                        objP = this.f51811g.p(objP, objH, null);
                    } else {
                        objP2 = this.f51811g.p(objP2, objH, null);
                    }
                    z10 = z11;
                    it2 = it3;
                }
            }
            Object objO = this.f51811g.o(objP, objP2, this.f51812h);
            if (FragmentManager.b1(2)) {
                Objects.toString(objO);
                viewGroup.toString();
            }
            return new Pair<>(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(f1.d dVar, f1.d dVar2, g this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            v0.a(dVar.h(), dVar2.h(), this$0.f51820p, this$0.f51819o, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(x0 impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList transitioningViews) {
            Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
            v0.e(transitioningViews, 4);
        }

        @NotNull
        public final ArrayList<View> A() {
            return this.f51813i;
        }

        @NotNull
        public final ArrayList<View> B() {
            return this.f51814j;
        }

        @NotNull
        public final androidx.collection.a<String, String> C() {
            return this.f51815k;
        }

        @Nullable
        public final Object D() {
            return this.f51812h;
        }

        @NotNull
        public final x0 E() {
            return this.f51811g;
        }

        @NotNull
        public final List<h> F() {
            return this.f51808d;
        }

        @NotNull
        public final androidx.core.os.f G() {
            return this.f51821q;
        }

        public final boolean I() {
            List<h> list = this.f51808d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final boolean J() {
            return this.f51820p;
        }

        public final void O(@Nullable Object obj) {
            this.f51822r = obj;
        }

        public final void P(boolean z10) {
            this.f51823s = z10;
        }

        @Override // androidx.fragment.app.f1.b
        public boolean b() {
            Object obj;
            if (this.f51811g.m()) {
                List<h> list = this.f51808d;
                if ((list instanceof Collection) && list.isEmpty()) {
                    obj = this.f51812h;
                    if (obj != null) {
                    }
                    return true;
                }
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.f51811g.n(hVar.f())) {
                    }
                }
                obj = this.f51812h;
                if (obj != null || this.f51811g.n(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.fragment.app.f1.b
        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f51821q.a();
        }

        @Override // androidx.fragment.app.f1.b
        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut() || this.f51823s) {
                for (h hVar : this.f51808d) {
                    f1.d dVarA = hVar.a();
                    if (FragmentManager.b1(2)) {
                        if (this.f51823s) {
                            Objects.toString(dVarA);
                        } else {
                            container.toString();
                            Objects.toString(dVarA);
                        }
                    }
                    hVar.a().e(this);
                }
                this.f51823s = false;
                return;
            }
            Object obj = this.f51822r;
            if (obj != null) {
                x0 x0Var = this.f51811g;
                Intrinsics.checkNotNull(obj);
                x0Var.c(obj);
                if (FragmentManager.b1(2)) {
                    Objects.toString(this.f51809e);
                    Objects.toString(this.f51810f);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairO = o(container, this.f51810f, this.f51809e);
            ArrayList<View> arrayListComponent1 = pairO.component1();
            Object objComponent2 = pairO.component2();
            List<h> list = this.f51808d;
            ArrayList<f1.d> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).a());
            }
            for (final f1.d dVar : arrayList) {
                this.f51811g.y(dVar.h(), objComponent2, this.f51821q, new Runnable() { // from class: androidx.fragment.app.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.g.K(dVar, this);
                    }
                });
            }
            N(arrayListComponent1, container, new a(container, objComponent2));
            if (FragmentManager.b1(2)) {
                Objects.toString(this.f51809e);
                Objects.toString(this.f51810f);
            }
        }

        @Override // androidx.fragment.app.f1.b
        public void e(@NotNull androidx.activity.d backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            Object obj = this.f51822r;
            if (obj != null) {
                this.f51811g.v(obj, backEvent.a());
            }
        }

        @Override // androidx.fragment.app.f1.b
        public void f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.f51808d.iterator();
                while (it.hasNext()) {
                    f1.d dVarA = ((h) it.next()).a();
                    if (FragmentManager.b1(2)) {
                        container.toString();
                        Objects.toString(dVarA);
                    }
                }
                return;
            }
            if (I() && this.f51812h != null && !b()) {
                Objects.toString(this.f51812h);
                Objects.toString(this.f51809e);
                Objects.toString(this.f51810f);
            }
            if (b() && I()) {
                final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                Pair<ArrayList<View>, Object> pairO = o(container, this.f51810f, this.f51809e);
                ArrayList<View> arrayListComponent1 = pairO.component1();
                Object objComponent2 = pairO.component2();
                List<h> list = this.f51808d;
                ArrayList<f1.d> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).a());
                }
                for (final f1.d dVar : arrayList) {
                    this.f51811g.z(dVar.h(), objComponent2, this.f51821q, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.g.L(hVar);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.g.M(dVar, this);
                        }
                    });
                }
                N(arrayListComponent1, container, new b(container, objComponent2, hVar));
            }
        }

        @Nullable
        public final Object s() {
            return this.f51822r;
        }

        @NotNull
        public final ArrayList<String> t() {
            return this.f51816l;
        }

        @NotNull
        public final ArrayList<String> u() {
            return this.f51817m;
        }

        @Nullable
        public final f1.d v() {
            return this.f51809e;
        }

        @NotNull
        public final androidx.collection.a<String, View> w() {
            return this.f51818n;
        }

        @Nullable
        public final f1.d x() {
            return this.f51810f;
        }

        @NotNull
        public final androidx.collection.a<String, View> y() {
            return this.f51819o;
        }

        public final boolean z() {
            return this.f51823s;
        }
    }

    private static final class h extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Object f51834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f51835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Object f51836d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull f1.d operation, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            f1.d.b bVarG = operation.g();
            f1.d.b bVar = f1.d.b.VISIBLE;
            if (bVarG == bVar) {
                Fragment fragmentH = operation.h();
                returnTransition = z10 ? fragmentH.getReenterTransition() : fragmentH.getEnterTransition();
            } else {
                Fragment fragmentH2 = operation.h();
                returnTransition = z10 ? fragmentH2.getReturnTransition() : fragmentH2.getExitTransition();
            }
            this.f51834b = returnTransition;
            this.f51835c = operation.g() == bVar ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f51836d = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final x0 d(Object obj) {
            if (obj == null) {
                return null;
            }
            x0 x0Var = v0.f52017b;
            if (x0Var != null && x0Var.g(obj)) {
                return x0Var;
            }
            x0 x0Var2 = v0.f52018c;
            if (x0Var2 != null && x0Var2.g(obj)) {
                return x0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        @Nullable
        public final x0 c() {
            x0 x0VarD = d(this.f51834b);
            x0 x0VarD2 = d(this.f51836d);
            if (x0VarD != null && x0VarD2 != null && x0VarD != x0VarD2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f51834b + " which uses a different Transition  type than its shared element transition " + this.f51836d).toString());
            }
            return x0VarD == null ? x0VarD2 : x0VarD;
        }

        @Nullable
        public final Object e() {
            return this.f51836d;
        }

        @Nullable
        public final Object f() {
            return this.f51834b;
        }

        public final boolean g() {
            return this.f51836d != null;
        }

        public final boolean h() {
            return this.f51835c;
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function1<Map.Entry<String, View>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection<String> f51837a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection) {
            super(1);
            this.f51837a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull Map.Entry<String, View> entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt.contains(this.f51837a, u1.A0(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @e.a({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void F(List<b> list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((b) it.next()).a().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z10 = false;
        for (b bVar : list) {
            Context context = t().getContext();
            f1.d dVarA = bVar.a();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            t.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f51974b == null) {
                    arrayList.add(bVar);
                } else {
                    Fragment fragmentH = dVarA.h();
                    if (dVarA.f().isEmpty()) {
                        if (dVarA.g() == f1.d.b.GONE) {
                            dVarA.q(false);
                        }
                        dVarA.b(new c(bVar));
                        z10 = true;
                    } else if (FragmentManager.b1(2)) {
                        Objects.toString(fragmentH);
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            f1.d dVarA2 = bVar2.a();
            Fragment fragmentH2 = dVarA2.h();
            if (zIsEmpty) {
                if (!z10) {
                    dVarA2.b(new a(bVar2));
                } else if (FragmentManager.b1(2)) {
                    Objects.toString(fragmentH2);
                }
            } else if (FragmentManager.b1(2)) {
                Objects.toString(fragmentH2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(d this$0, f1.d operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.c(operation);
    }

    private final void H(List<h> list, boolean z10, f1.d dVar, f1.d dVar2) {
        Object objD;
        ArrayList arrayList;
        Iterator it;
        ArrayList<String> sharedElementTargetNames;
        String strB;
        int i10;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((h) obj).b()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((h) obj2).c() != null) {
                arrayList3.add(obj2);
            }
        }
        x0 x0Var = null;
        for (h hVar : arrayList3) {
            x0 x0VarC = hVar.c();
            if (x0Var != null && x0VarC != x0Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            x0Var = x0VarC;
        }
        if (x0Var == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        androidx.collection.a aVar = new androidx.collection.a();
        ArrayList<String> arrayList6 = new ArrayList<>();
        ArrayList<String> arrayList7 = new ArrayList<>();
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
        Iterator it2 = arrayList3.iterator();
        ArrayList<String> arrayList8 = arrayList6;
        ArrayList<String> sharedElementSourceNames = arrayList7;
        loop3: while (true) {
            objD = null;
            while (true) {
                if (!it2.hasNext()) {
                    break loop3;
                }
                h hVar2 = (h) it2.next();
                if (!hVar2.g() || dVar == null || dVar2 == null) {
                    arrayList = arrayList3;
                    it = it2;
                } else {
                    objD = x0Var.D(x0Var.h(hVar2.e()));
                    sharedElementSourceNames = dVar2.h().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = dVar.h().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames2 = dVar.h().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        ArrayList arrayList9 = arrayList3;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i11));
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i11));
                        }
                        i11++;
                        arrayList3 = arrayList9;
                    }
                    arrayList = arrayList3;
                    sharedElementTargetNames = dVar2.h().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z10 ? TuplesKt.to(dVar.h().getExitTransitionCallback(), dVar2.h().getEnterTransitionCallback()) : TuplesKt.to(dVar.h().getEnterTransitionCallback(), dVar2.h().getExitTransitionCallback());
                    androidx.core.app.o0 o0Var = (androidx.core.app.o0) pair.component1();
                    androidx.core.app.o0 o0Var2 = (androidx.core.app.o0) pair.component2();
                    int size2 = sharedElementSourceNames.size();
                    int i12 = 0;
                    while (true) {
                        it = it2;
                        if (i12 >= size2) {
                            break;
                        }
                        int i13 = size2;
                        String str = sharedElementSourceNames.get(i12);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                        String str2 = sharedElementTargetNames.get(i12);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                        aVar.put(str, str2);
                        i12++;
                        it2 = it;
                        size2 = i13;
                    }
                    if (FragmentManager.b1(2)) {
                        for (String str3 : sharedElementTargetNames) {
                        }
                        for (String str4 : sharedElementSourceNames) {
                        }
                    }
                    View view = dVar.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                    I(aVar2, view);
                    aVar2.o(sharedElementSourceNames);
                    if (o0Var != null) {
                        if (FragmentManager.b1(2)) {
                            dVar.toString();
                        }
                        o0Var.d(sharedElementSourceNames, aVar2);
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i14 = size3 - 1;
                                String str5 = sharedElementSourceNames.get(size3);
                                Intrinsics.checkNotNullExpressionValue(str5, "exitingNames[i]");
                                String str6 = str5;
                                View view2 = aVar2.get(str6);
                                if (view2 == null) {
                                    aVar.remove(str6);
                                    i10 = i14;
                                } else {
                                    i10 = i14;
                                    if (!Intrinsics.areEqual(str6, u1.A0(view2))) {
                                        aVar.put(u1.A0(view2), (String) aVar.remove(str6));
                                    }
                                }
                                if (i10 < 0) {
                                    break;
                                } else {
                                    size3 = i10;
                                }
                            }
                        }
                    } else {
                        aVar.o(aVar2.keySet());
                    }
                    View view3 = dVar2.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view3, "lastIn.fragment.mView");
                    I(aVar3, view3);
                    aVar3.o(sharedElementTargetNames);
                    aVar3.o(aVar.values());
                    if (o0Var2 != null) {
                        if (FragmentManager.b1(2)) {
                            dVar2.toString();
                        }
                        o0Var2.d(sharedElementTargetNames, aVar3);
                        int size4 = sharedElementTargetNames.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i15 = size4 - 1;
                                String str7 = sharedElementTargetNames.get(size4);
                                Intrinsics.checkNotNullExpressionValue(str7, "enteringNames[i]");
                                String str8 = str7;
                                View view4 = aVar3.get(str8);
                                if (view4 == null) {
                                    String strB2 = v0.b(aVar, str8);
                                    if (strB2 != null) {
                                        aVar.remove(strB2);
                                    }
                                } else if (!Intrinsics.areEqual(str8, u1.A0(view4)) && (strB = v0.b(aVar, str8)) != null) {
                                    aVar.put(strB, u1.A0(view4));
                                }
                                if (i15 < 0) {
                                    break;
                                } else {
                                    size4 = i15;
                                }
                            }
                        }
                    } else {
                        v0.d(aVar, aVar3);
                    }
                    Collection<String> collectionKeySet = aVar.keySet();
                    Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                    J(aVar2, collectionKeySet);
                    Collection<String> collectionValues = aVar.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                    J(aVar3, collectionValues);
                    if (aVar.isEmpty()) {
                        break;
                    } else {
                        arrayList8 = sharedElementTargetNames;
                    }
                }
                arrayList3 = arrayList;
                it2 = it;
            }
            Objects.toString(objD);
            dVar.toString();
            dVar2.toString();
            arrayList4.clear();
            arrayList5.clear();
            arrayList8 = sharedElementTargetNames;
            arrayList3 = arrayList;
            it2 = it;
        }
        ArrayList arrayList10 = arrayList3;
        if (objD == null) {
            if (arrayList10.isEmpty()) {
                return;
            }
            Iterator it3 = arrayList10.iterator();
            while (it3.hasNext()) {
                if (((h) it3.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList10, dVar, dVar2, x0Var, objD, arrayList4, arrayList5, aVar, arrayList8, sharedElementSourceNames, aVar2, aVar3, z10);
        Iterator it4 = arrayList10.iterator();
        while (it4.hasNext()) {
            ((h) it4.next()).a().b(gVar);
        }
    }

    private final void I(Map<String, View> map, View view) {
        String strA0 = u1.A0(view);
        if (strA0 != null) {
            map.put(strA0, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    I(map, child);
                }
            }
        }
    }

    private final void J(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = aVar.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new i(collection));
    }

    private final void K(List<? extends f1.d> list) {
        Fragment fragmentH = ((f1.d) CollectionsKt.last((List) list)).h();
        for (f1.d dVar : list) {
            dVar.h().mAnimationInfo.f51637c = fragmentH.mAnimationInfo.f51637c;
            dVar.h().mAnimationInfo.f51638d = fragmentH.mAnimationInfo.f51638d;
            dVar.h().mAnimationInfo.f51639e = fragmentH.mAnimationInfo.f51639e;
            dVar.h().mAnimationInfo.f51640f = fragmentH.mAnimationInfo.f51640f;
        }
    }

    @Override // androidx.fragment.app.f1
    public void d(@NotNull List<? extends f1.d> operations, boolean z10) {
        f1.d dVar;
        Object next;
        Intrinsics.checkNotNullParameter(operations, "operations");
        FragmentManager.b1(2);
        Iterator<T> it = operations.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f1.d dVar2 = (f1.d) next;
            f1.d.b.a aVar = f1.d.b.f51877a;
            View view = dVar2.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            f1.d.b bVarA = aVar.a(view);
            f1.d.b bVar = f1.d.b.VISIBLE;
            if (bVarA == bVar && dVar2.g() != bVar) {
                break;
            }
        }
        f1.d dVar3 = (f1.d) next;
        ListIterator<? extends f1.d> listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            f1.d dVarPrevious = listIterator.previous();
            f1.d dVar4 = dVarPrevious;
            f1.d.b.a aVar2 = f1.d.b.f51877a;
            View view2 = dVar4.h().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            f1.d.b bVarA2 = aVar2.a(view2);
            f1.d.b bVar2 = f1.d.b.VISIBLE;
            if (bVarA2 != bVar2 && dVar4.g() == bVar2) {
                dVar = dVarPrevious;
                break;
            }
        }
        f1.d dVar5 = dVar;
        if (FragmentManager.b1(2)) {
            Objects.toString(dVar3);
            Objects.toString(dVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        K(operations);
        for (final f1.d dVar6 : operations) {
            arrayList.add(new b(dVar6, z10));
            boolean z11 = false;
            if (z10) {
                if (dVar6 == dVar3) {
                    z11 = true;
                }
            } else if (dVar6 == dVar5) {
                z11 = true;
            }
            arrayList2.add(new h(dVar6, z10, z11));
            dVar6.a(new Runnable() { // from class: androidx.fragment.app.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.G(this.f51778a, dVar6);
                }
            });
        }
        H(arrayList2, z10, dVar3, dVar5);
        F(arrayList);
    }
}
