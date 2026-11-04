package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.net.Uri;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.feed.FeedArticleFragment;
import com.planner5d.library.model.manager.statistics.events.q3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nBlogPostNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogPostNavigation.kt\ncom/planner5d/library/activity/helper/BlogPostNavigation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136754e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.model.manager.b f136755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f136756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f136757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m2 f136758d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.BlogPostNavigation", f = "BlogPostNavigation.kt", i = {0, 0}, l = {33, 34}, m = "findBlog", n = {"this", "blogName"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f136761c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136763e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136761c = obj;
            this.f136763e |= Integer.MIN_VALUE;
            return e.this.d(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.BlogPostNavigation$navigateByHash$1", f = "BlogPostNavigation.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBlogPostNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogPostNavigation.kt\ncom/planner5d/library/activity/helper/BlogPostNavigation$navigateByHash$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136764a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f136766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f136767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Activity f136768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f136769f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, Activity activity, Uri uri, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f136766c = str;
            this.f136767d = str2;
            this.f136768e = activity;
            this.f136769f = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f136766c, this.f136767d, this.f136768e, this.f136769f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136764a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e eVar = e.this;
                String str = this.f136766c;
                String str2 = this.f136767d;
                this.f136764a = 1;
                obj = eVar.d(str, str2, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            jc.a aVar = (jc.a) obj;
            if (aVar != null) {
                e.this.e(aVar);
            } else {
                e.this.f136758d.a(this.f136768e, this.f136769f.toString());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e(@NotNull com.planner5d.library.model.manager.b blogRepository, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.services.utility.f1 globalScope, @NotNull m2 uriViewer) {
        Intrinsics.checkNotNullParameter(blogRepository, "blogRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(globalScope, "globalScope");
        Intrinsics.checkNotNullParameter(uriViewer, "uriViewer");
        this.f136755a = blogRepository;
        this.f136756b = navigator;
        this.f136757c = globalScope;
        this.f136758d = uriViewer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r9 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, java.lang.String r8, kotlin.coroutines.d<? super jc.a> r9) {
        /*
            r6 = this;
            r5 = 0
            boolean r0 = r9 instanceof com.planner5d.library.activity.helper.e.a
            if (r0 == 0) goto L15
            r0 = r9
            r5 = 7
            com.planner5d.library.activity.helper.e$a r0 = (com.planner5d.library.activity.helper.e.a) r0
            int r1 = r0.f136763e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f136763e = r1
            goto L1b
        L15:
            r5 = 5
            com.planner5d.library.activity.helper.e$a r0 = new com.planner5d.library.activity.helper.e$a
            r0.<init>(r9)
        L1b:
            java.lang.Object r9 = r0.f136761c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 3
            int r2 = r0.f136763e
            r3 = 2
            r5 = 4
            r4 = 1
            r5 = 3
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L32
            kotlin.ResultKt.m(r9)
            goto L7f
        L32:
            r5 = 4
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 1
            throw r6
        L3c:
            java.lang.Object r6 = r0.f136760b
            r8 = r6
            r8 = r6
            r5 = 7
            java.lang.String r8 = (java.lang.String) r8
            r5 = 6
            java.lang.Object r6 = r0.f136759a
            com.planner5d.library.activity.helper.e r6 = (com.planner5d.library.activity.helper.e) r6
            kotlin.ResultKt.m(r9)
            goto L61
        L4c:
            kotlin.ResultKt.m(r9)
            if (r7 == 0) goto L69
            com.planner5d.library.model.manager.b r9 = r6.f136755a
            r0.f136759a = r6
            r0.f136760b = r8
            r0.f136763e = r4
            java.lang.Object r9 = r9.u(r7, r0)
            r5 = 1
            if (r9 != r1) goto L61
            goto L7d
        L61:
            r5 = 1
            jc.a r9 = (jc.a) r9
            if (r9 != 0) goto L68
            r5 = 5
            goto L69
        L68:
            return r9
        L69:
            r7 = 4
            r7 = 0
            if (r8 == 0) goto L83
            com.planner5d.library.model.manager.b r6 = r6.f136755a
            r5 = 5
            r0.f136759a = r7
            r5 = 4
            r0.f136760b = r7
            r0.f136763e = r3
            java.lang.Object r9 = r6.v(r8, r0)
            if (r9 != r1) goto L7f
        L7d:
            r5 = 3
            return r1
        L7f:
            r5 = 2
            jc.a r9 = (jc.a) r9
            return r9
        L83:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.helper.e.d(java.lang.String, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(jc.a aVar) {
        this.f136756b.f(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedArticleFragment.class, new com.planner5d.library.services.utility.i(new jc.b(aVar).m()).t(com.planner5d.library.services.r.source, q3.d.deeplink).a()), true);
    }

    public final void f(@Nullable Activity activity, @Nullable String str, @Nullable String str2, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        kotlinx.coroutines.k.f(this.f136757c, com.planner5d.library.services.utility.s.f229729a.h(), null, new b(str, str2, activity, uri, null), 2, null);
    }
}
