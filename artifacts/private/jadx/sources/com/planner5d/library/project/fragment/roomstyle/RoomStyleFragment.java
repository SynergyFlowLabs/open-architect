package com.planner5d.library.project.fragment.roomstyle;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.u;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.widget.GridLayoutManagerItemDecorationInvalidation;
import com.planner5d.library.widget.c0;
import com.planner5d.library.widget.k0;
import com.planner5d.library.widget.preloader.t;
import com.planner5d.library.widget.textview.ButtonTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRoomStyleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleFragment.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n16#2:123\n1#3:124\n774#4:125\n865#4,2:126\n*S KotlinDebug\n*F\n+ 1 RoomStyleFragment.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleFragment\n*L\n34#1:123\n85#1:125\n85#1:126,2\n*E\n"})
public final class RoomStyleFragment extends Fragment implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nd.c f223724a;

    @ij.a
    public com.planner5d.library.activity.fragment.feed.b autoStyleListProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f223725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f223726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f223727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f223728e;

    @ij.a
    public y0 imageManager;

    @ij.a
    public fg.e<b2> messageManager;

    @ij.a
    public x navigator;

    @ij.a
    public fg.e<NetworkErrorUtility> networkErrorUtility;

    @SourceDebugExtension({"SMAP\nRoomStyleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleFragment.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleFragment$onViewCreated$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n2632#2,3:123\n*S KotlinDebug\n*F\n+ 1 RoomStyleFragment.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleFragment$onViewCreated$1\n*L\n91#1:123,3\n*E\n"})
    static final class a<T> implements kotlinx.coroutines.flow.j {
        a() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<j> list, kotlin.coroutines.d<? super Unit> dVar) {
            boolean z10;
            RoomStyleFragment.this.y().k(list);
            nd.c cVar = RoomStyleFragment.this.f223724a;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cVar = null;
            }
            ButtonTextView buttonTextView = cVar.f332759b;
            List<j> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z10 = true;
            } else {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).m()) {
                        z10 = false;
                    }
                }
                z10 = true;
            }
            buttonTextView.setEnabled(!z10);
            return Unit.f312394a;
        }
    }

    static final class b<T> implements kotlinx.coroutines.flow.j {
        b() {
        }

        public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
            RoomStyleFragment.this.f223727d.a().u(z10);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return a(((Boolean) obj).booleanValue(), dVar);
        }
    }

    static final class c<T> implements kotlinx.coroutines.flow.j {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(RoomStyleFragment roomStyleFragment) {
            roomStyleFragment.B().o0();
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(Exception exc, kotlin.coroutines.d<? super Unit> dVar) {
            NetworkErrorUtility networkErrorUtility = RoomStyleFragment.this.getNetworkErrorUtility$P5D_Library_Project_release().get();
            Context contextRequireContext = RoomStyleFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            if (exc == null) {
                return Unit.f312394a;
            }
            if (networkErrorUtility.isNetworkError(contextRequireContext, exc)) {
                b2 b2Var = RoomStyleFragment.this.getMessageManager$P5D_Library_Project_release().get();
                u message = ErrorMessageException.createNetworkException().toMessage();
                u.a aVar = u.f222823l;
                final RoomStyleFragment roomStyleFragment = RoomStyleFragment.this;
                b2Var.e(message.e(new u.a(aVar, (Function0<Unit>) new Function0() { // from class: com.planner5d.library.project.fragment.roomstyle.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RoomStyleFragment.c.c(roomStyleFragment);
                    }
                })));
            } else {
                RoomStyleFragment.this.getMessageManager$P5D_Library_Project_release().get().r(new ErrorMessageException(exc, md.b.s.f326646lb, new String[0]));
            }
            return Unit.f312394a;
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f223732a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f223732a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f223732a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f223732a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 RoomStyleFragment.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleFragment\n*L\n1#1,16:1\n34#2:17\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return RoomStyleFragment.this.getViewModelStore();
        }
    }

    public static final class f implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f223734a;

        public f(com.planner5d.library.view.b bVar) {
            this.f223734a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f223734a;
        }
    }

    public RoomStyleFragment() {
        com.planner5d.library.project.application.c.a aVar = com.planner5d.library.project.application.c.f223658b;
        this.f223725b = new i2(j1.d(l.class), new e(), new f(aVar.a()), null, 8, null);
        this.f223726c = g0.c(new Function0() { // from class: com.planner5d.library.project.fragment.roomstyle.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomStyleFragment.x(this.f223737a);
            }
        });
        this.f223727d = new t();
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f223728e = hVarA;
        aVar.a().j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence A(j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l B() {
        return (l) this.f223725b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(RoomStyleFragment roomStyleFragment, View view) {
        roomStyleFragment.B().t0(roomStyleFragment.z());
        roomStyleFragment.B().r0(roomStyleFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(RoomStyleFragment roomStyleFragment, l.b bVar) {
        if (bVar != null) {
            x.g(roomStyleFragment.getNavigator$P5D_Library_Project_release(), new com.planner5d.library.activity.helper.event.content.c(roomStyleFragment.getAutoStyleListProvider().a(), (Bundle) null).k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedFragment.class, (Bundle) null)), false, 2, null);
        }
        return Unit.f312394a;
    }

    private final void E(com.planner5d.library.services.utility.j jVar) {
        long jD = jVar.d(r.id, 0L);
        if (jD != 0) {
            B().n0(jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g x(RoomStyleFragment roomStyleFragment) {
        return new g(roomStyleFragment.f223728e, roomStyleFragment.getImageManager$P5D_Library_Project_release(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g y() {
        return (g) this.f223726c.getValue();
    }

    private final String z() {
        List<j> value = B().getUiState().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((j) obj).m()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.planner5d.library.project.fragment.roomstyle.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return RoomStyleFragment.A((j) obj2);
            }
        }, 30, null);
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.feed.b getAutoStyleListProvider() {
        com.planner5d.library.activity.fragment.feed.b bVar = this.autoStyleListProvider;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("autoStyleListProvider");
        return null;
    }

    @NotNull
    public final y0 getImageManager$P5D_Library_Project_release() {
        y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @NotNull
    public final fg.e<b2> getMessageManager$P5D_Library_Project_release() {
        fg.e<b2> eVar = this.messageManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @NotNull
    public final x getNavigator$P5D_Library_Project_release() {
        x xVar = this.navigator;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @NotNull
    public final fg.e<NetworkErrorUtility> getNetworkErrorUtility$P5D_Library_Project_release() {
        fg.e<NetworkErrorUtility> eVar = this.networkErrorUtility;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkErrorUtility");
        return null;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        B().s0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        B().o0();
        nd.c cVarC = nd.c.c(inflater);
        Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
        this.f223727d.b(cVarC.f332762e);
        cVarC.f332761d.setAdapter(y());
        RecyclerView recyclerView = cVarC.f332761d;
        RecyclerView roomStyleList = cVarC.f332761d;
        Intrinsics.checkNotNullExpressionValue(roomStyleList, "roomStyleList");
        recyclerView.setLayoutManager(new GridLayoutManagerItemDecorationInvalidation(roomStyleList, 2));
        cVarC.f332761d.n(new k0(getResources().getDimensionPixelSize(md.b.g.Mh)));
        cVarC.f332759b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.project.fragment.roomstyle.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomStyleFragment.C(this.f223736a, view);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            E(new com.planner5d.library.services.utility.j(arguments));
        }
        this.f223724a = cVarC;
        FrameLayout root = cVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        l1 l1Var = l1.f225303a;
        l1.c(l1Var, this, B().getUiState(), null, new a(), 2, null);
        l1.c(l1Var, this, B().k0(), null, new b(), 2, null);
        l1.c(l1Var, this, B().j0(), null, new c(), 2, null);
        B().l0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.project.fragment.roomstyle.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomStyleFragment.D(this.f223735a, (l.b) obj);
            }
        }));
    }

    public final void setAutoStyleListProvider(@NotNull com.planner5d.library.activity.fragment.feed.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.autoStyleListProvider = bVar;
    }

    public final void setImageManager$P5D_Library_Project_release(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }

    public final void setMessageManager$P5D_Library_Project_release(@NotNull fg.e<b2> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.messageManager = eVar;
    }

    public final void setNavigator$P5D_Library_Project_release(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.navigator = xVar;
    }

    public final void setNetworkErrorUtility$P5D_Library_Project_release(@NotNull fg.e<NetworkErrorUtility> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.networkErrorUtility = eVar;
    }
}
