package com.planner5d.library.activity.fragment.settings;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.d1;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.managedfiles.a0;
import com.planner5d.library.model.manager.managedfiles.v;
import com.planner5d.library.modules.user.user.m0;
import com.planner5d.library.modules.user.user.o0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.c0;
import com.planner5d.library.widget.d0;
import com.planner5d.library.widget.preloader.t;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSettingsPageOther.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPageOther.kt\ncom/planner5d/library/activity/fragment/settings/SettingsPageOther\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class d extends FrameLayout implements c0, d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135211d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f135212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.profile.a f135213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.activity.form.d> f135214c;

    static final class a implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135215a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135215a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f135215a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135215a.invoke(obj);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, @NotNull ij.c<Activity> activity, @NotNull t preloader, @NotNull b2 messageManager, @NotNull o0 userPromoCodeManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @Nullable id.a aVar, @NotNull a0 managedFileManager, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull m0 userPrivateData, @NotNull f1 coroutineScope, @NotNull com.planner5d.library.util.navigation.uiview.c appUiView) {
        com.planner5d.library.activity.form.h hVar;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(preloader, "preloader");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(userPromoCodeManager, "userPromoCodeManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(userPrivateData, "userPrivateData");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(appUiView, "appUiView");
        this.f135212a = preloader;
        com.planner5d.library.activity.fragment.profile.a aVar2 = new com.planner5d.library.activity.fragment.profile.a(managedFileManager, coroutineScope);
        this.f135213b = aVar2;
        View.inflate(context, com.planner5d.library.f.m.f168658c9, this);
        final ViewManagedFiles viewManagedFiles = (ViewManagedFiles) findViewById(com.planner5d.library.f.j.Ug);
        aVar2.b().k(lifecycleOwner, new a(new Function1() { // from class: com.planner5d.library.activity.fragment.settings.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.c(viewManagedFiles, (v) obj);
            }
        }));
        viewManagedFiles.x(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.settings.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.d(this.f135209a, view);
            }
        }, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.settings.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.a(this.f135210a, view);
            }
        });
        Activity activity2 = activity.get();
        Intrinsics.checkNotNullExpressionValue(activity2, "get(...)");
        Activity activity3 = activity2;
        View viewFindViewById = findViewById(com.planner5d.library.f.j.O9);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        com.planner5d.library.activity.form.e eVar = new com.planner5d.library.activity.form.e(activity3, (ViewDataRemoval) viewFindViewById, preloader, userAuthorization, messageManager, userPrivateData, appUiView);
        ViewPromoCode viewPromoCode = (ViewPromoCode) findViewById(com.planner5d.library.f.j.oo);
        if (aVar == null) {
            viewPromoCode.setVisibility(8);
            findViewById(com.planner5d.library.f.j.Tr).setVisibility(8);
            hVar = null;
        } else {
            Activity activity4 = activity.get();
            Intrinsics.checkNotNullExpressionValue(activity4, "get(...)");
            Intrinsics.checkNotNull(viewPromoCode);
            hVar = new com.planner5d.library.activity.form.h(activity4, viewPromoCode, preloader, userPromoCodeManager, aVar, messageManager);
        }
        this.f135214c = ArraysKt.filterNotNull(new com.planner5d.library.activity.form.d[]{eVar, hVar});
    }

    public static void a(d dVar, View view) {
        dVar.f135213b.f();
    }

    public static Unit c(ViewManagedFiles viewManagedFiles, v vVar) {
        Intrinsics.checkNotNull(vVar);
        viewManagedFiles.y(vVar);
        return Unit.f312394a;
    }

    public static void d(d dVar, View view) {
        dVar.f135213b.e();
    }

    @Override // com.planner5d.library.widget.d0
    public void b() {
    }

    @NotNull
    public final t getPreloader() {
        return this.f135212a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        for (Object obj : this.f135214c) {
            if (((com.planner5d.library.activity.form.d) obj).g()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
