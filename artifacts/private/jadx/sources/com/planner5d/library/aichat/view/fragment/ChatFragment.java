package com.planner5d.library.aichat.view.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.p0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.aichat.view.bottomsheet.x;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nChatFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatFragment.kt\ncom/planner5d/library/aichat/view/fragment/ChatFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n16#2:170\n1#3:171\n255#4:172\n299#4,2:173\n1863#5,2:175\n*S KotlinDebug\n*F\n+ 1 ChatFragment.kt\ncom/planner5d/library/aichat/view/fragment/ChatFragment\n*L\n39#1:170\n129#1:172\n131#1:173,2\n107#1:175,2\n*E\n"})
public final class ChatFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f142164e = new i2(j1.d(m.class), new c(), new d(com.planner5d.library.aichat.application.a.f141896b.a()), null, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f142165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f142166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private wa.a f142167h;

    @ij.a
    public y paywallService;

    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wa.a f142168h;

        a(wa.a aVar) {
            this.f142168h = aVar;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            dispose();
            this.f142168h.f385947b.setImageBitmap(null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f142168h.f385947b.setImageBitmap(bitmap);
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f142169a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f142169a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f142169a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f142169a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ChatFragment.kt\ncom/planner5d/library/aichat/view/fragment/ChatFragment\n*L\n1#1,16:1\n39#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ChatFragment.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f142171a;

        public d(com.planner5d.library.view.b bVar) {
            this.f142171a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f142171a;
        }
    }

    private final void J(LinearLayout linearLayout, final Pair<Integer, String> pair) {
        wa.a aVar = this.f142167h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        wa.f fVarD = wa.f.d(LayoutInflater.from(aVar.getRoot().getContext()), linearLayout, true);
        fVarD.f385987b.setImageResource(((Number) d0(pair.getFirst())).intValue());
        fVarD.f385989d.setText(pair.getSecond());
        fVarD.f385988c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.aichat.view.fragment.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatFragment.K(this.f142180a, pair, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(ChatFragment chatFragment, Pair pair, View view) {
        chatFragment.X((String) pair.getSecond());
    }

    private final String L() {
        wa.a aVar = this.f142167h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        return StringsKt.E5(aVar.f385949d.getText().toString()).toString();
    }

    private final m M() {
        return (m) this.f142164e.getValue();
    }

    private final void N() {
        wa.a aVar = this.f142167h;
        wa.a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        RecyclerView.p layoutManager = aVar.f385950e.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        wa.a aVar3 = this.f142167h;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar3 = null;
        }
        ScrollView suggestionLayout = aVar3.f385951f;
        Intrinsics.checkNotNullExpressionValue(suggestionLayout, "suggestionLayout");
        if (suggestionLayout.getVisibility() == 0) {
            linearLayoutManager.n3(true);
            wa.a aVar4 = this.f142167h;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                aVar2 = aVar4;
            }
            ScrollView suggestionLayout2 = aVar2.f385951f;
            Intrinsics.checkNotNullExpressionValue(suggestionLayout2, "suggestionLayout");
            suggestionLayout2.setVisibility(8);
        }
    }

    private final void O(wa.a aVar) {
        m mVarM = M();
        int height = aVar.f385947b.getHeight();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f142166g;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        mVarM.j0(height, hVar.c(new a(aVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(wa.a aVar, Boolean bool) {
        aVar.f385948c.setAlpha(bool.booleanValue() ? 0.4f : 1.0f);
        aVar.f385948c.setEnabled(!bool.booleanValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(final ChatFragment chatFragment, final wa.a aVar, List list) {
        x xVar = chatFragment.f142165f;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar = null;
        }
        xVar.l(list, new Runnable() { // from class: com.planner5d.library.aichat.view.fragment.a
            @Override // java.lang.Runnable
            public final void run() {
                ChatFragment.R(this.f142172a, aVar);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(ChatFragment chatFragment, wa.a aVar) {
        x xVar = chatFragment.f142165f;
        x xVar2 = null;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar = null;
        }
        x xVar3 = chatFragment.f142165f;
        if (xVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar3 = null;
        }
        xVar.notifyItemChanged(xVar3.getItemCount() - 1);
        RecyclerView recyclerView = aVar.f385950e;
        x xVar4 = chatFragment.f142165f;
        if (xVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            xVar2 = xVar4;
        }
        recyclerView.M1(xVar2.getItemCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(ChatFragment chatFragment, View view) {
        chatFragment.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T(ChatFragment chatFragment, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return false;
        }
        chatFragment.W();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V() {
        return Unit.f312394a;
    }

    private final void W() {
        String strL = L();
        if (strL != null) {
            X(strL);
        }
    }

    private final void X(String str) {
        if (!Intrinsics.areEqual(M().f0().f(), Boolean.FALSE) || str.length() <= 0) {
            return;
        }
        M().l0(getContext(), str, false);
        wa.a aVar = this.f142167h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f385949d.getText().clear();
        N();
    }

    private final void Y() {
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        n1.a(viewLifecycleOwner, M().i0(), new Function1() { // from class: com.planner5d.library.aichat.view.fragment.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.Z(this.f142182a, (List) obj);
            }
        });
        x xVar = this.f142165f;
        x xVar2 = null;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar = null;
        }
        xVar.q(new Function1() { // from class: com.planner5d.library.aichat.view.fragment.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.a0(this.f142183a, (String) obj);
            }
        });
        x xVar3 = this.f142165f;
        if (xVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            xVar2 = xVar3;
        }
        xVar2.r(new Function0() { // from class: com.planner5d.library.aichat.view.fragment.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.b0(this.f142174a);
            }
        });
        M().k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(ChatFragment chatFragment, List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        wa.a aVar = chatFragment.f142167h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        LinearLayout linearLayout = aVar.f385952g;
        linearLayout.removeAllViews();
        Iterator it = suggestions.iterator();
        while (it.hasNext()) {
            Pair<Integer, String> pair = (Pair) it.next();
            Intrinsics.checkNotNull(linearLayout);
            chatFragment.J(linearLayout, pair);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(ChatFragment chatFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chatFragment.X(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(ChatFragment chatFragment) {
        chatFragment.c0();
        return Unit.f312394a;
    }

    @e.a({"RestrictedApi"})
    private final void c0() {
        wa.a aVar = this.f142167h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        p0.q(aVar.f385949d);
        getPaywallService().a(r.paywallPlacementAiChat.f224891a);
    }

    private final <Int> Int d0(Int r10) {
        int i10;
        if (Intrinsics.areEqual((Object) r10, (Object) 1)) {
            i10 = sa.b.g.Z9;
        } else {
            i10 = Intrinsics.areEqual((Object) r10, (Object) 2) ? sa.b.g.f368750aa : sa.b.g.f368765ba;
        }
        return (Int) Integer.valueOf(i10);
    }

    @NotNull
    public final y getPaywallService() {
        y yVar = this.paywallService;
        if (yVar != null) {
            return yVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallService");
        boolean z10 = true;
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).N(true).w(false).K(new k3(sa.b.q.S, new Object[0])).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer the extended version of this method instead")
    public /* synthetic */ View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final wa.a aVarD = wa.a.d(inflater, viewGroup, false);
        this.f142167h = aVarD;
        com.planner5d.library.aichat.application.a.f141896b.a().k(this);
        this.f142166g = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNull(viewGroup);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f142165f = new x(context);
        M().f0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.aichat.view.fragment.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.P(aVarD, (Boolean) obj);
            }
        }));
        RecyclerView recyclerView = aVarD.f385950e;
        x xVar = this.f142165f;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            xVar = null;
        }
        recyclerView.setAdapter(xVar);
        aVarD.f385950e.setItemAnimator(null);
        M().g0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.aichat.view.fragment.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatFragment.Q(this.f142176a, aVarD, (List) obj);
            }
        }));
        aVarD.f385948c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.aichat.view.fragment.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatFragment.S(this.f142178a, view);
            }
        });
        aVarD.f385949d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.planner5d.library.aichat.view.fragment.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return ChatFragment.T(this.f142179a, textView, i10, keyEvent);
            }
        });
        u1.j2(aVarD.f385949d, new ef.a(new Function0() { // from class: com.planner5d.library.aichat.view.fragment.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.U();
            }
        }, new Function0() { // from class: com.planner5d.library.aichat.view.fragment.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatFragment.V();
            }
        }));
        Intrinsics.checkNotNull(aVarD);
        O(aVarD);
        Y();
        ConstraintLayout root = aVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        M().d0();
        super.onDestroy();
    }

    public final void setPaywallService(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.paywallService = yVar;
    }
}
