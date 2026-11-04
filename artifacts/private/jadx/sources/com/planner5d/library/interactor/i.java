package com.planner5d.library.interactor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.profile.ProfileNavigationFragment;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.util.navigation.external.NestedNavigationState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class i implements le.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180167e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.n f180168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final le.d f180169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f180170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f180171d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.HandleNewIntentInteractor", f = "HandleNewIntentInteractor.kt", i = {0}, l = {46, 60}, m = "findSupportedUri", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f180173b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180175d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180173b = obj;
            this.f180175d |= Integer.MIN_VALUE;
            return i.this.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.HandleNewIntentInteractor", f = "HandleNewIntentInteractor.kt", i = {0, 0}, l = {31}, m = "handle", n = {"this", "intent"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f180178c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180180e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180178c = obj;
            this.f180180e |= Integer.MIN_VALUE;
            return i.this.a(null, null, this);
        }
    }

    @ij.a
    public i(@NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider, @NotNull le.d handleDeepLinkUseCase, @NotNull b2 messageManager, @NotNull com.planner5d.library.activity.fragment.x navigator) {
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        Intrinsics.checkNotNullParameter(handleDeepLinkUseCase, "handleDeepLinkUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f180168a = defaultFragmentProvider;
        this.f180169b = handleDeepLinkUseCase;
        this.f180170c = messageManager;
        this.f180171d = navigator;
    }

    private final void c() {
        int i10 = (7 | 0) << 2;
        com.planner5d.library.activity.fragment.x.g(this.f180171d, new com.planner5d.library.activity.helper.event.content.c(this.f180168a.a(), (Bundle) null), false, 2, null);
    }

    private final void d(String str) {
        com.planner5d.library.activity.fragment.x xVar = this.f180171d;
        com.planner5d.library.activity.fragment.profile.q.a aVarE = com.planner5d.library.activity.fragment.profile.q.e(str);
        Intrinsics.checkNotNullExpressionValue(aVarE, "toPrivacyAgreement(...)");
        com.planner5d.library.activity.fragment.x.g(xVar, new oe.a((Class<? extends FragmentController>) ProfileNavigationFragment.class, new NestedNavigationState(aVarE)), false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // le.e
    @Nullable
    public Object a(@NotNull Intent intent, @NotNull Activity activity, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f180180e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f180180e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objB = bVar.f180178c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f180180e;
        if (i11 == 0) {
            ResultKt.m(objB);
            bVar.f180176a = this;
            bVar.f180177b = intent;
            bVar.f180180e = 1;
            objB = b(intent, activity, bVar);
            if (objB == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intent = (Intent) bVar.f180177b;
            this = (i) bVar.f180176a;
            ResultKt.m(objB);
        }
        if (!((Boolean) objB).booleanValue()) {
            com.planner5d.library.activity.fragment.x.g(this.f180171d, new com.planner5d.library.activity.helper.event.content.c(this.f180168a.a(), new com.planner5d.library.services.utility.i().i(com.planner5d.library.services.r.importProjectIntent, intent).a()), false, 2, null);
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r6 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if (r6.a(r8, r7, r0) == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // le.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull android.content.Intent r7, @org.jetbrains.annotations.Nullable android.app.Activity r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.interactor.i.b(android.content.Intent, android.app.Activity, kotlin.coroutines.d):java.lang.Object");
    }
}
