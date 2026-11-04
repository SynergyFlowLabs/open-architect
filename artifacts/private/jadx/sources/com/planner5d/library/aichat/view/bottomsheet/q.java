package com.planner5d.library.aichat.view.bottomsheet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.g3;
import androidx.core.view.l2;
import androidx.core.view.u1;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import com.google.android.material.internal.p0;
import com.planner5d.library.model.manager.statistics.events.i3;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.r3;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAiChatBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiChatBottomSheet.kt\ncom/planner5d/library/aichat/view/bottomsheet/AiChatBottomSheet\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Rect.kt\nandroidx/core/graphics/RectKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n278#2,2:434\n278#2,2:436\n278#2,2:438\n327#2,4:441\n299#2,2:446\n271#3:440\n1#4:445\n1863#5,2:448\n*S KotlinDebug\n*F\n+ 1 AiChatBottomSheet.kt\ncom/planner5d/library/aichat/view/bottomsheet/AiChatBottomSheet\n*L\n92#1:434,2\n125#1:436,2\n133#1:438,2\n261#1:441,4\n411#1:446,2\n141#1:440\n302#1:448,2\n*E\n"})
public final class q extends FrameLayout implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public t f142041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.services.y f142042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public i3 f142043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final wa.d f142044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AdvancedBottomSheetBehavior<View> f142045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final o0 f142046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.ui.c f142047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.keyboard.a f142048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.bottomsheet.b f142049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.bottomsheet.b f142050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x f142051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private xa.c f142052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ta.a f142053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private xa.a f142054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private xa.b f142055o;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatBottomSheet", f = "AiChatBottomSheet.kt", i = {0}, l = {152}, m = "executeCommands", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f142057b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f142059d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f142057b = obj;
            this.f142059d |= Integer.MIN_VALUE;
            return q.this.a(null, this);
        }
    }

    public static final class b extends AdvancedBottomSheetBehavior.e {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i10 == 4 || i10 == 6 || i10 == 7) {
                com.planner5d.library.services.s.f(q.this.f142044d.f385967g, false);
            }
            if (i10 == 5) {
                q.this.getEvents().V(i3.a.chat_close);
            }
        }
    }

    public static final class c implements View.OnGenericMotionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f142061a = new Rect();

        c() {
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 8) {
                return false;
            }
            q.this.f142044d.f385967g.getGlobalVisibleRect(this.f142061a);
            return this.f142061a.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    public static final class d implements o0 {
        d() {
        }

        @Override // androidx.lifecycle.o0
        public androidx.lifecycle.c0 getLifecycle() {
            return q.this.f142047g;
        }
    }

    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            q qVar = q.this;
            qVar.j0(qVar.f142044d);
        }
    }

    @SourceDebugExtension({"SMAP\nAiChatBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiChatBottomSheet.kt\ncom/planner5d/library/aichat/view/bottomsheet/AiChatBottomSheet$startWatchingKeyboard$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,433:1\n327#2,4:434\n*S KotlinDebug\n*F\n+ 1 AiChatBottomSheet.kt\ncom/planner5d/library/aichat/view/bottomsheet/AiChatBottomSheet$startWatchingKeyboard$1\n*L\n228#1:434,4\n*E\n"})
    public static final class f extends l2.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f142065e;

        f() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0054  */
        @Override // androidx.core.view.l2.b
        public g3 e(g3 insets, List<l2> runningAnimations) {
            int i10;
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
            int i11 = insets.f(g3.m.d()).f47826d;
            FrameLayout aiChatInput = q.this.f142044d.f385963c;
            Intrinsics.checkNotNullExpressionValue(aiChatInput, "aiChatInput");
            q qVar = q.this;
            ViewGroup.LayoutParams layoutParams = aiChatInput.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i11 <= 0) {
                i10 = 0;
            } else {
                if (this.f142065e < i11) {
                    qVar.B();
                }
                i10 = i11 - insets.f(g3.m.g()).f47826d;
                if (i10 <= 0) {
                    i10 = 0;
                }
            }
            marginLayoutParams.bottomMargin = i10;
            this.f142065e = i11;
            aiChatInput.setLayoutParams(marginLayoutParams);
            q.this.f142045e.g0(0);
            return insets;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatBottomSheet$startWatchingKeyboard$2", f = "AiChatBottomSheet.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.P1}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142067a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(q qVar, boolean z10) {
            if (z10) {
                qVar.i0();
                qVar.B();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142067a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.keyboard.a aVar = q.this.f142048h;
                View root = q.this.f142044d.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                final q qVar = q.this;
                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return q.g.m(qVar, ((Boolean) obj2).booleanValue());
                    }
                };
                this.f142067a = 1;
                if (aVar.a(root, function1, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public q(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        if (this.f142045e.getState() == 6 || this.f142045e.getState() == 4) {
            this.f142045e.g(3);
        }
    }

    private final void C() {
        RecyclerView.p layoutManager = this.f142044d.f385973m.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.T2()) {
            return;
        }
        linearLayoutManager.n3(true);
        ScrollView suggestionLayout = this.f142044d.f385974n;
        Intrinsics.checkNotNullExpressionValue(suggestionLayout, "suggestionLayout");
        suggestionLayout.setVisibility(8);
    }

    private final void D() {
        AdvancedBottomSheetBehavior<View> advancedBottomSheetBehavior = this.f142045e;
        advancedBottomSheetBehavior.X0(getResources().getDimensionPixelSize(sa.b.f.f368685wd));
        advancedBottomSheetBehavior.L0(getResources().getDimensionPixelSize(sa.b.f.V0));
        advancedBottomSheetBehavior.Q0(true);
        advancedBottomSheetBehavior.W(new com.planner5d.library.bottomsheet.a(new Function0() { // from class: com.planner5d.library.aichat.view.bottomsheet.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.E(this.f142040a);
            }
        }));
        advancedBottomSheetBehavior.W(this.f142049i);
        advancedBottomSheetBehavior.W(this.f142050j);
        advancedBottomSheetBehavior.W(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(q qVar) {
        qVar.A();
        return Unit.f312394a;
    }

    private final void F() {
        setOnGenericMotionListener(new c());
    }

    private final void G() {
        this.f142044d.f385970j.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.aichat.view.bottomsheet.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.H(this.f142028a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(q qVar, View view) {
        if (qVar.f142045e.getState() == 6 || qVar.f142045e.getState() == 3) {
            qVar.A();
        }
    }

    private final void I() {
        u1.j2(this.f142044d.f385968h, new ef.g(0, 1, null));
    }

    private final boolean J() {
        return !Intrinsics.areEqual(getViewModel().w0().f(), Boolean.FALSE);
    }

    private final void L() {
        A();
        xa.a aVar = this.f142054n;
        xa.a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aiChatItemSelector");
            aVar = null;
        }
        aVar.c(new Function0() { // from class: com.planner5d.library.aichat.view.bottomsheet.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.M(this.f142039a);
            }
        });
        xa.a aVar3 = this.f142054n;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aiChatItemSelector");
        } else {
            aVar2 = aVar3;
        }
        aVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(q qVar) {
        qVar.O(t.f142074i3);
        qVar.K();
        return Unit.f312394a;
    }

    private final void N() {
        String string = StringsKt.E5(this.f142044d.f385972l.getText().toString()).toString();
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            O(string);
        }
    }

    private final void O(String str) {
        if (J()) {
            return;
        }
        xa.c cVar = null;
        if (Intrinsics.areEqual(str, t.f142074i3)) {
            xa.c cVar2 = this.f142052l;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editorInfoProvider");
                cVar2 = null;
            }
            List<String> listB = cVar2.b();
            if (listB == null || listB.isEmpty()) {
                return;
            }
        }
        t viewModel = getViewModel();
        xa.c cVar3 = this.f142052l;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editorInfoProvider");
        } else {
            cVar = cVar3;
        }
        viewModel.N0(str, cVar, this, false);
        this.f142044d.f385972l.getText().clear();
        C();
    }

    private final void P() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        x xVar = new x(context);
        this.f142051k = xVar;
        this.f142044d.f385973m.setAdapter(xVar);
        this.f142044d.f385973m.setItemAnimator(null);
        this.f142044d.f385966f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.aichat.view.bottomsheet.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.Q(this.f142037a, view);
            }
        });
        this.f142044d.f385972l.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.planner5d.library.aichat.view.bottomsheet.n
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return q.R(this.f142038a, textView, i10, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(q qVar, View view) {
        if (Intrinsics.areEqual(qVar.getViewModel().w0().f(), Boolean.TRUE)) {
            qVar.g0();
        } else {
            qVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(q qVar, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 4 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        qVar.N();
        return true;
    }

    private final void S() {
        n1.a(this.f142046f, getViewModel().C0(), new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.T(this.f142016a, (List) obj);
            }
        });
        x xVar = this.f142051k;
        x xVar2 = null;
        int i10 = 5 ^ 0;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar = null;
        }
        xVar.q(new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.U(this.f142022a, (String) obj);
            }
        });
        x xVar3 = this.f142051k;
        if (xVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            xVar2 = xVar3;
        }
        xVar2.r(new Function0() { // from class: com.planner5d.library.aichat.view.bottomsheet.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.V(this.f142024a);
            }
        });
        getViewModel().E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(q qVar, List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        LinearLayout linearLayout = qVar.f142044d.f385975o;
        linearLayout.removeAllViews();
        Iterator it = suggestions.iterator();
        while (it.hasNext()) {
            Pair<Integer, String> pair = (Pair) it.next();
            Intrinsics.checkNotNull(linearLayout);
            qVar.y(linearLayout, pair);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(q qVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qVar.O(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(q qVar) {
        qVar.e0();
        return Unit.f312394a;
    }

    @e.a({"NotifyDataSetChanged"})
    private final void W() {
        n1.a(this.f142046f, getViewModel().w0(), new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.X(this.f142015a, ((Boolean) obj).booleanValue());
            }
        });
        this.f142044d.f385972l.addTextChangedListener(new e());
        n1.a(this.f142046f, getViewModel().x0(), new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.Y(this.f142032a, (List) obj);
            }
        });
        n1.a(this.f142046f, getViewModel().B0(), new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.Z(this.f142033a, (com.planner5d.library.services.utility.o) obj);
            }
        });
        n1.a(this.f142046f, getViewModel().v0(), new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.a0(this.f142034a, (com.planner5d.library.services.utility.o) obj);
            }
        });
        n1.a(this.f142046f, getViewModel().z0(), new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.b0(this.f142035a, (com.planner5d.library.services.utility.o) obj);
            }
        });
        n1.a(this.f142046f, getViewModel().u0(), new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.c0(this.f142036a, (com.planner5d.library.services.utility.o) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(q qVar, boolean z10) {
        qVar.j0(qVar.f142044d);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(final q qVar, List messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        if (!messages.isEmpty()) {
            qVar.C();
        }
        x xVar = qVar.f142051k;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar = null;
        }
        xVar.l(messages, new Runnable() { // from class: com.planner5d.library.aichat.view.bottomsheet.f
            @Override // java.lang.Runnable
            public final void run() {
                q.setupSubscriptions$lambda$15$lambda$14(this.f142029a);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(q qVar, com.planner5d.library.services.utility.o shouldSelect) {
        Intrinsics.checkNotNullParameter(shouldSelect, "shouldSelect");
        r3 r3VarA = shouldSelect.a();
        if (r3VarA != null) {
            boolean z10 = !false;
            if (((Boolean) r3VarA.a()).booleanValue()) {
                qVar.L();
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(q qVar, com.planner5d.library.services.utility.o shouldClose) {
        Intrinsics.checkNotNullParameter(shouldClose, "shouldClose");
        r3 r3VarA = shouldClose.a();
        if (r3VarA != null && ((Boolean) r3VarA.a()).booleanValue()) {
            qVar.A();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(q qVar, com.planner5d.library.services.utility.o shouldOpen) {
        Intrinsics.checkNotNullParameter(shouldOpen, "shouldOpen");
        r3 r3VarA = shouldOpen.a();
        if (r3VarA != null && ((Boolean) r3VarA.a()).booleanValue()) {
            qVar.K();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(q qVar, com.planner5d.library.services.utility.o started) {
        Intrinsics.checkNotNullParameter(started, "started");
        r3 r3VarA = started.a();
        if (r3VarA != null && ((Boolean) r3VarA.a()).booleanValue()) {
            qVar.A();
            xa.b bVar = qVar.f142055o;
            if (bVar != null) {
                bVar.b();
            }
        }
        return Unit.f312394a;
    }

    private final void d0() {
        W();
        getViewModel().D0();
    }

    @e.a({"RestrictedApi"})
    private final void e0() {
        p0.q(this.f142044d.f385963c);
        getPaywallService().a(com.planner5d.library.services.r.paywallPlacementAiChat.f224891a);
    }

    private final void f0() {
        if (Build.VERSION.SDK_INT >= 30) {
            u1.G2(getRootView(), new f());
        } else {
            kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(this.f142046f), null, null, new g(null), 3, null);
        }
    }

    private final void g0() {
        getViewModel().t0();
    }

    private final <Int> Int h0(Int r10) {
        int i10;
        if (Intrinsics.areEqual((Object) r10, (Object) 1)) {
            i10 = sa.b.g.Z9;
        } else {
            i10 = Intrinsics.areEqual((Object) r10, (Object) 2) ? sa.b.g.f368750aa : sa.b.g.f368765ba;
        }
        return (Int) Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        FrameLayout aiChatInput = this.f142044d.f385963c;
        Intrinsics.checkNotNullExpressionValue(aiChatInput, "aiChatInput");
        ViewGroup.LayoutParams layoutParams = aiChatInput.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        com.planner5d.library.services.s sVar = com.planner5d.library.services.s.f224951a;
        FrameLayout aiChatInput2 = this.f142044d.f385963c;
        Intrinsics.checkNotNullExpressionValue(aiChatInput2, "aiChatInput");
        g3 g3VarB = sVar.b(aiChatInput2);
        if (g3VarB != null) {
            int i10 = g3VarB.f(g3.m.d()).f47826d - g3VarB.f(g3.m.g()).f47826d;
            timber.log.b.f381052a.a("Bottom margin = " + i10, new Object[0]);
            marginLayoutParams.bottomMargin = i10;
        }
        aiChatInput.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(wa.d dVar) {
        if (Intrinsics.areEqual(getViewModel().w0().f(), Boolean.TRUE)) {
            dVar.f385966f.setEnabled(true);
            dVar.f385966f.setImageResource(sa.b.g.f368806e6);
            return;
        }
        ImageView imageView = dVar.f385966f;
        Editable text = dVar.f385972l.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        imageView.setEnabled(StringsKt.E5(text).length() > 0);
        dVar.f385966f.setImageResource(sa.b.g.f368761b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSubscriptions$lambda$15$lambda$14(q qVar) {
        x xVar = qVar.f142051k;
        x xVar2 = null;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar = null;
        }
        x xVar3 = qVar.f142051k;
        if (xVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar3 = null;
        }
        xVar.notifyItemChanged(xVar3.getItemCount() - 1);
        RecyclerView recyclerView = qVar.f142044d.f385973m;
        x xVar4 = qVar.f142051k;
        if (xVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            xVar2 = xVar4;
        }
        recyclerView.M1(xVar2.getItemCount() - 1);
    }

    private final void y(LinearLayout linearLayout, final Pair<Integer, String> pair) {
        int i10 = 2 >> 1;
        wa.f fVarD = wa.f.d(LayoutInflater.from(this.f142044d.getRoot().getContext()), linearLayout, true);
        fVarD.f385987b.setImageResource(((Number) h0(pair.getFirst())).intValue());
        fVarD.f385989d.setText(pair.getSecond());
        fVarD.f385988c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.aichat.view.bottomsheet.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.z(this.f142030a, pair, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(q qVar, Pair pair, View view) {
        qVar.O((String) pair.getSecond());
    }

    public final void A() {
        this.f142045e.g(5);
        FrameLayout aiChatInput = this.f142044d.f385963c;
        Intrinsics.checkNotNullExpressionValue(aiChatInput, "aiChatInput");
        aiChatInput.setVisibility(4);
        com.planner5d.library.services.s.f(this.f142044d.getRoot(), false);
        this.f142048h.b();
    }

    public final void K() {
        FrameLayout aiChatInput = this.f142044d.f385963c;
        Intrinsics.checkNotNullExpressionValue(aiChatInput, "aiChatInput");
        aiChatInput.setVisibility(0);
        this.f142045e.g(6);
        f0();
        getEvents().V(i3.a.chat_open);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // ta.a
    @Nullable
    public Object a(@NotNull List<? extends JSONObject> list, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f142059d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f142059d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f142057b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f142059d;
        if (i11 == 0) {
            ResultKt.m(obj);
            ta.a aVar2 = this.f142053m;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aiChatCommandsExecutor");
                aVar2 = null;
            }
            aVar.f142056a = this;
            aVar.f142059d = 1;
            if (aVar2.a(list, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (q) aVar.f142056a;
            ResultKt.m(obj);
        }
        xa.b bVar = this.f142055o;
        if (bVar != null) {
            bVar.a();
        }
        xa.b bVar2 = this.f142055o;
        if (bVar2 != null) {
            bVar2.c();
        }
        return Unit.f312394a;
    }

    @kotlin.l(message = "Remove once we have cleaner solution to obtain all editor item action views")
    @NotNull
    public final RectF getDrawerBounds() {
        Rect rect = new Rect();
        this.f142044d.f385967g.getGlobalVisibleRect(rect);
        return new RectF(rect);
    }

    @NotNull
    public final i3 getEvents() {
        i3 i3Var = this.f142043c;
        if (i3Var != null) {
            return i3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventEntry.tableName);
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.y getPaywallService() {
        com.planner5d.library.services.y yVar = this.f142042b;
        if (yVar != null) {
            return yVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallService");
        return null;
    }

    @NotNull
    public final t getViewModel() {
        t tVar = this.f142041a;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f142047g.o(androidx.lifecycle.c0.a.ON_START);
        d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f142047g.o(androidx.lifecycle.c0.a.ON_DESTROY);
    }

    public final void setAiChatLoader(@NotNull xa.b aiChatLoader) {
        Intrinsics.checkNotNullParameter(aiChatLoader, "aiChatLoader");
        this.f142055o = aiChatLoader;
    }

    public final void setEditorActionsExecutor(@NotNull ta.a aiChatCommandsExecutor) {
        Intrinsics.checkNotNullParameter(aiChatCommandsExecutor, "aiChatCommandsExecutor");
        this.f142053m = aiChatCommandsExecutor;
    }

    public final void setEditorItemSelector(@NotNull xa.a aiChatItemSelector) {
        Intrinsics.checkNotNullParameter(aiChatItemSelector, "aiChatItemSelector");
        this.f142054n = aiChatItemSelector;
    }

    public final void setEvents(@NotNull i3 i3Var) {
        Intrinsics.checkNotNullParameter(i3Var, "<set-?>");
        this.f142043c = i3Var;
    }

    public final void setPaywallService(@NotNull com.planner5d.library.services.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.f142042b = yVar;
    }

    public final void setProjectId(long j10) {
        getViewModel().O0(j10);
    }

    public final void setProjectProvider(@NotNull xa.c projectJsonProvider) {
        Intrinsics.checkNotNullParameter(projectJsonProvider, "projectJsonProvider");
        this.f142052l = projectJsonProvider;
    }

    public final void setViewModel(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f142041a = tVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public q(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ q(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public q(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        wa.d dVarB = wa.d.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(dVarB, "inflate(...)");
        this.f142044d = dVarB;
        AdvancedBottomSheetBehavior<View> advancedBottomSheetBehaviorI0 = AdvancedBottomSheetBehavior.i0(dVarB.f385967g);
        Intrinsics.checkNotNullExpressionValue(advancedBottomSheetBehaviorI0, "from(...)");
        this.f142045e = advancedBottomSheetBehaviorI0;
        d dVar = new d();
        this.f142046f = dVar;
        this.f142047g = new com.planner5d.library.activity.helper.ui.c(dVar);
        this.f142048h = new com.planner5d.library.keyboard.a();
        RecyclerView messages = dVarB.f385973m;
        Intrinsics.checkNotNullExpressionValue(messages, "messages");
        FrameLayout aiChatInput = dVarB.f385963c;
        Intrinsics.checkNotNullExpressionValue(aiChatInput, "aiChatInput");
        this.f142049i = new com.planner5d.library.bottomsheet.b(messages, aiChatInput);
        ScrollView suggestionLayout = dVarB.f385974n;
        Intrinsics.checkNotNullExpressionValue(suggestionLayout, "suggestionLayout");
        FrameLayout aiChatInput2 = dVarB.f385963c;
        Intrinsics.checkNotNullExpressionValue(aiChatInput2, "aiChatInput");
        this.f142050j = new com.planner5d.library.bottomsheet.b(suggestionLayout, aiChatInput2);
        com.planner5d.library.aichat.application.a.f141896b.a().j(this);
        advancedBottomSheetBehaviorI0.g(5);
        FrameLayout aiChatInput3 = dVarB.f385963c;
        Intrinsics.checkNotNullExpressionValue(aiChatInput3, "aiChatInput");
        aiChatInput3.setVisibility(4);
        I();
        F();
        D();
        G();
        P();
        S();
    }
}
