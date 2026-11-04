package com.planner5d.library.activity.fragment.feed.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.databinding.v5;
import com.planner5d.library.services.utility.t;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.textview.ButtonTextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class j extends com.planner5d.library.feed.view.holders.c<Unit> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f133415f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v5 f133416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ja.c f133417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s0 f133418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f133419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private p2 f133420e;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.holders.ViewHolderDesignGeneratorItem$bind$1$2", f = "ViewHolderDesignGeneratorItem.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v5 f133423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f133424d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v5 v5Var, j jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f133423c = v5Var;
            this.f133424d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f133423c, this.f133424d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ButtonTextView buttonTextView;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133422b;
            if (i10 == 0) {
                ResultKt.m(obj);
                ButtonTextView buttonTextView2 = this.f133423c.f159820n3;
                ja.c cVar = this.f133424d.f133417b;
                this.f133421a = buttonTextView2;
                this.f133422b = 1;
                Object objN = cVar.n(this);
                if (objN == objL) {
                    return objL;
                }
                obj = objN;
                buttonTextView = buttonTextView2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                buttonTextView = (ButtonTextView) this.f133421a;
                ResultKt.m(obj);
            }
            buttonTextView.setText(((Number) obj).intValue());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(@NotNull v5 binding, @NotNull ja.c viewHolderProjectListener, @NotNull s0 coroutineScope, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewHolderProjectListener, "viewHolderProjectListener");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f133416a = binding;
        this.f133417b = viewHolderProjectListener;
        this.f133418c = coroutineScope;
        this.f133419d = coroutineDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(j jVar, View view) {
        jVar.f133417b.G();
    }

    @Override // com.planner5d.library.feed.view.holders.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable Unit unit) {
        v5 v5Var = this.f133416a;
        v5Var.o1(EnhancedRecyclerView.e.LIST);
        v5Var.p1(Boolean.TRUE);
        v5Var.s();
        v5Var.f159818l3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.holders.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.k(this.f133414a, view);
            }
        });
        p2 p2Var = this.f133420e;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f133420e = kotlinx.coroutines.k.f(this.f133418c, this.f133419d.a(), null, new a(v5Var, this, null), 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(@NotNull Context context, @NotNull ja.c viewHolderProjectListener, @NotNull s0 coroutineScope, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewHolderProjectListener, "viewHolderProjectListener");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        v5 v5VarK1 = v5.k1(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(v5VarK1, "inflate(...)");
        this(v5VarK1, viewHolderProjectListener, coroutineScope, coroutineDispatchers);
    }
}
