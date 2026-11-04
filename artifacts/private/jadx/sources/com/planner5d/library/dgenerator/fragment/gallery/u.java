package com.planner5d.library.dgenerator.fragment.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessage;
import com.planner5d.library.activity.helper.x;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.database.model.AutoStyleImage;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.y0;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nGalleryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryViewModel.kt\ncom/planner5d/library/dgenerator/fragment/gallery/GalleryViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1872#2,3:181\n*S KotlinDebug\n*F\n+ 1 GalleryViewModel.kt\ncom/planner5d/library/dgenerator/fragment/gallery/GalleryViewModel\n*L\n135#1:181,3\n*E\n"})
public final class u extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f160241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f160242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pd.a f160243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final nb.c f160244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final nb.b f160245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final x f160246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final nb.e f160247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f160248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final j3 f160249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<c> f160250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final w0<c> f160251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final k0<b> f160252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final z0<b> f160253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final k0<a> f160254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final z0<a> f160255o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Long f160256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.services.utility.o<Boolean>> f160257t;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f160260a;

        public b() {
            this(false, 1, null);
        }

        public static /* synthetic */ b c(b bVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = bVar.f160260a;
            }
            return bVar.b(z10);
        }

        public final boolean a() {
            return this.f160260a;
        }

        @NotNull
        public final b b(boolean z10) {
            return new b(z10);
        }

        public final boolean d() {
            return this.f160260a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f160260a == ((b) obj).f160260a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f160260a);
        }

        @NotNull
        public String toString() {
            return "LoadingState(loading=" + this.f160260a + ")";
        }

        public b(boolean z10) {
            this.f160260a = z10;
        }

        public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f160261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f160262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f160263c;

        public c(long j10, @NotNull String title, int i10) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f160261a = j10;
            this.f160262b = title;
            this.f160263c = i10;
        }

        public static /* synthetic */ c e(c cVar, long j10, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j10 = cVar.f160261a;
            }
            if ((i11 & 2) != 0) {
                str = cVar.f160262b;
            }
            if ((i11 & 4) != 0) {
                i10 = cVar.f160263c;
            }
            return cVar.d(j10, str, i10);
        }

        public final long a() {
            return this.f160261a;
        }

        @NotNull
        public final String b() {
            return this.f160262b;
        }

        public final int c() {
            return this.f160263c;
        }

        @NotNull
        public final c d(long j10, @NotNull String title, int i10) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new c(j10, title, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f160261a == cVar.f160261a && Intrinsics.areEqual(this.f160262b, cVar.f160262b) && this.f160263c == cVar.f160263c;
        }

        public final long f() {
            return this.f160261a;
        }

        public final int g() {
            return this.f160263c;
        }

        @NotNull
        public final String h() {
            return this.f160262b;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f160261a) * 31) + this.f160262b.hashCode()) * 31) + Integer.hashCode(this.f160263c);
        }

        @NotNull
        public String toString() {
            return "NavigationTarget(id=" + this.f160261a + ", title=" + this.f160262b + ", imageIndex=" + this.f160263c + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.gallery.GalleryViewModel", f = "GalleryViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "createRoomStyleLabel", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f160265b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f160267d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f160265b = obj;
            this.f160267d |= Integer.MIN_VALUE;
            return u.this.j0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.gallery.GalleryViewModel$delete$1$1$1", f = "GalleryViewModel.kt", i = {}, l = {115, me.relex.circleindicator.a.f332619e}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160268a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f160270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f160271d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.gallery.GalleryViewModel$delete$1$1$1$1", f = "GalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f160272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f160273b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f160273b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f160273b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f160272a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f160273b.invoke();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, Function0<Unit> function0, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f160270c = j10;
            this.f160271d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new e(this.f160270c, this.f160271d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (kotlinx.coroutines.i.h(r8, r1, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 4
                int r1 = r7.f160268a
                r6 = 1
                r2 = 2
                r3 = 1
                r6 = r3
                if (r1 == 0) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r8)
                goto L67
            L15:
                r6 = 0
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 4
                java.lang.String r8 = "e srwot e/ eu/ ceblfouo st/rii/hva/mknolio t/rnee//"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r6 = 1
                r7.<init>(r8)
                throw r7
            L22:
                kotlin.ResultKt.m(r8)
                r6 = 0
                goto L3e
            L27:
                r6 = 4
                kotlin.ResultKt.m(r8)
                com.planner5d.library.dgenerator.fragment.gallery.u r8 = com.planner5d.library.dgenerator.fragment.gallery.u.this
                nb.b r8 = com.planner5d.library.dgenerator.fragment.gallery.u.Z(r8)
                r6 = 6
                long r4 = r7.f160270c
                r7.f160268a = r3
                r6 = 3
                java.lang.Object r8 = r8.a(r4, r7)
                if (r8 != r0) goto L3e
                goto L66
            L3e:
                com.planner5d.library.dgenerator.fragment.gallery.u r8 = com.planner5d.library.dgenerator.fragment.gallery.u.this
                kotlinx.coroutines.flow.k0 r8 = com.planner5d.library.dgenerator.fragment.gallery.u.f0(r8)
                com.planner5d.library.dgenerator.fragment.gallery.u$b r1 = new com.planner5d.library.dgenerator.fragment.gallery.u$b
                r6 = 0
                r3 = 0
                r1.<init>(r3)
                r8.setValue(r1)
                com.planner5d.library.services.utility.s r8 = com.planner5d.library.services.utility.s.f229729a
                kotlinx.coroutines.a3 r8 = r8.a()
                r6 = 2
                com.planner5d.library.dgenerator.fragment.gallery.u$e$a r1 = new com.planner5d.library.dgenerator.fragment.gallery.u$e$a
                kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r7.f160271d
                r4 = 0
                r1.<init>(r3, r4)
                r6 = 7
                r7.f160268a = r2
                java.lang.Object r7 = kotlinx.coroutines.i.h(r8, r1, r7)
                if (r7 != r0) goto L67
            L66:
                return r0
            L67:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.dgenerator.fragment.gallery.u.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.gallery.GalleryViewModel$loadData$1", f = "GalleryViewModel.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {com.planner5d.library.engine.input.f.b.f160725s, 78, com.planner5d.library.engine.input.f.b.f160732u0}, m = "invokeSuspend", n = {"autoStyle", "roomTitle", AttributeType.LIST, "roomStyleId", FirebaseAnalytics.d.f120644b0, "autoStyle", "roomTitle", AttributeType.LIST, "autoStyleImages", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "L$1", "L$2", "L$4", "I$0", "L$0", "L$1", "L$2", "L$4", "I$0"})
    @SourceDebugExtension({"SMAP\nGalleryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryViewModel.kt\ncom/planner5d/library/dgenerator/fragment/gallery/GalleryViewModel$loadData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1557#2:181\n1628#2,3:182\n*S KotlinDebug\n*F\n+ 1 GalleryViewModel.kt\ncom/planner5d/library/dgenerator/fragment/gallery/GalleryViewModel$loadData$1\n*L\n77#1:181\n77#1:182,3\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f160275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f160276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f160279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f160280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f160281h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f160283j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f160283j = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new f(this.f160283j, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:38:0x0115  */
        /* JADX WARN: Code duplicated, block: B:41:0x014b  */
        /* JADX WARN: Code duplicated, block: B:44:0x0164  */
        /* JADX WARN: Code duplicated, block: B:53:0x019b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0164 -> B:45:0x016b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x019b -> B:33:0x00ea). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.dgenerator.fragment.gallery.u.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.gallery.GalleryViewModel$sendToGallery$1$1$1$bitmapTarget$1$1$1", f = "GalleryViewModel.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160284a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f160286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f160287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f160288e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, Bitmap bitmap, String str, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f160286c = context;
            this.f160287d = bitmap;
            this.f160288e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new g(this.f160286c, this.f160287d, this.f160288e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160284a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x xVar = u.this.f160246f;
                Context context = this.f160286c;
                Bitmap bitmap = this.f160287d;
                String str = this.f160288e;
                this.f160284a = 1;
                if (xVar.c(context, bitmap, str, this) == objL) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public u(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull pd.a getAutoStyleUseCase, @NotNull nb.c getAutoStyleImagesUseCase, @NotNull nb.b deleteAutoStyleUseCase, @NotNull x helperExportImage, @NotNull nb.e getTranslatedRoomStyleNameUseCase, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull j3 events) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(getAutoStyleUseCase, "getAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(getAutoStyleImagesUseCase, "getAutoStyleImagesUseCase");
        Intrinsics.checkNotNullParameter(deleteAutoStyleUseCase, "deleteAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(helperExportImage, "helperExportImage");
        Intrinsics.checkNotNullParameter(getTranslatedRoomStyleNameUseCase, "getTranslatedRoomStyleNameUseCase");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f160241a = application;
        this.f160242b = dialogLauncher;
        this.f160243c = getAutoStyleUseCase;
        this.f160244d = getAutoStyleImagesUseCase;
        this.f160245e = deleteAutoStyleUseCase;
        this.f160246f = helperExportImage;
        this.f160247g = getTranslatedRoomStyleNameUseCase;
        this.f160248h = builtInDataManager;
        this.f160249i = events;
        c1<c> c1Var = new c1<>(null);
        this.f160250j = c1Var;
        this.f160251k = c1Var;
        k0<b> k0VarA = b1.a(new b(false, 1, null));
        this.f160252l = k0VarA;
        this.f160253m = k0VarA;
        k0<a> k0VarA2 = b1.a(new a(0 == true ? 1 : 0, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0));
        this.f160254n = k0VarA2;
        this.f160255o = k0VarA2;
        this.f160257t = new c1<>(new com.planner5d.library.services.utility.o(Boolean.FALSE));
    }

    private final void A0() {
        j3.d.a(this.f160249i, j3.a.button_click, null, j3.b.save_all_to_gallery, null, null, null, 58, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p h0(String str, int i10, final String str2) {
        return new p(p.a.Image, str, i10, new Function1() { // from class: com.planner5d.library.dgenerator.fragment.gallery.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.i0(this.f160236a, str2, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(u uVar, String str, int i10) {
        uVar.t0(str, i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j0(String str, kotlin.coroutines.d<? super p> dVar) {
        d dVar2;
        p.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f160267d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f160267d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f160265b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f160267d;
        if (i11 == 0) {
            ResultKt.m(obj);
            p.a aVar2 = p.a.Title;
            nb.e eVar = this.f160247g;
            long j10 = Long.parseLong(str);
            dVar2.f160264a = aVar2;
            dVar2.f160267d = 1;
            Object objA = eVar.a(j10, dVar2);
            if (objA == objL) {
                return objL;
            }
            obj = objA;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p.a) dVar2.f160264a;
            ResultKt.m(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = AbstractJsonLexerKt.NULL;
        }
        return new p(aVar, str2, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(u uVar, long j10, Function0 function0, Boolean bool) {
        if (!bool.booleanValue()) {
            uVar.y0();
            return;
        }
        uVar.z0();
        uVar.f160252l.setValue(new b(true));
        kotlinx.coroutines.k.f(g2.a(uVar), com.planner5d.library.services.utility.s.f229729a.h(), null, uVar.new e(j10, function0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q0(Integer num) {
        if (num != null) {
            String strB = this.f160248h.b0(num.intValue()).b();
            if (strB != null) {
                return strB;
            }
        }
        return "";
    }

    private final void t0(String str, int i10) {
        c1<c> c1Var = this.f160250j;
        Long l10 = this.f160256s;
        if (l10 != null) {
            c1Var.o(new c(l10.longValue(), str, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(u uVar, Context context, String str, Bitmap bitmap) {
        if (bitmap != null) {
            kotlinx.coroutines.k.f(g2.a(uVar), com.planner5d.library.services.utility.s.f229729a.h(), null, uVar.new g(context, bitmap, str, null), 2, null);
        }
    }

    private final void x0() {
        j3.d.a(this.f160249i, j3.a.popup_view, null, null, null, null, j3.e.delete, 30, null);
    }

    private final void y0() {
        j3.d.a(this.f160249i, j3.a.button_click, null, j3.b.delete_folder_cancel, null, null, null, 58, null);
    }

    private final void z0() {
        j3.d.a(this.f160249i, j3.a.button_click, null, j3.b.delete_folder_confirm, null, null, null, 58, null);
    }

    public final void B0() {
        int i10 = 5 ^ 0;
        j3.d.a(this.f160249i, j3.a.screen_view, j3.g.cards_gallery, null, null, null, null, 60, null);
    }

    public final void k0(@NotNull final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        x0();
        Long l10 = this.f160256s;
        if (l10 == null) {
            timber.log.b.f381052a.d("Unable to delete auto-style because autoStyleId is null", new Object[0]);
        } else {
            final long jLongValue = l10.longValue();
            ConfirmDeleteMessage.show(this.f160242b, this.f160241a.getString(com.planner5d.library.f.s.bw), new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.dgenerator.fragment.gallery.r
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    u.l0(this.f160233a, jLongValue, onFinish, (Boolean) obj);
                }
            });
        }
    }

    @NotNull
    public final c1<com.planner5d.library.services.utility.o<Boolean>> m0() {
        return this.f160257t;
    }

    @NotNull
    public final z0<a> n0() {
        return this.f160255o;
    }

    @NotNull
    public final z0<b> o0() {
        return this.f160253m;
    }

    @NotNull
    public final w0<c> p0() {
        return this.f160251k;
    }

    public final void r0(long j10) {
        this.f160256s = Long.valueOf(j10);
        this.f160252l.setValue(new b(true));
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new f(j10, null), 2, null);
    }

    public final void s0() {
        this.f160250j.r(null);
    }

    public final void u0(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 y0Var, @NotNull final Context context) {
        List<AutoStyleImage> listD;
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        y0 imageManager = y0Var;
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(context, "context");
        A0();
        this.f160252l.setValue(new b(true));
        AutoStyle autoStyleE = this.f160254n.getValue().e();
        if (autoStyleE != null && (listD = autoStyleE.D()) != null) {
            int i10 = 0;
            for (Object obj : listD) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AutoStyleImage autoStyleImage = (AutoStyleImage) obj;
                String strV = autoStyleImage.v();
                if (strV != null) {
                    final String str = autoStyleE.getId() + "_" + od.a.f333624e.c(autoStyleE.z()) + "_" + autoStyleImage.u() + "_" + i10;
                    com.planner5d.library.services.bitmaploader.target.a aVarB = new com.planner5d.library.services.bitmaploader.target.a.C1664a().b(bitmapTargetManager, new androidx.core.util.e() { // from class: com.planner5d.library.dgenerator.fragment.gallery.t
                        @Override // androidx.core.util.e
                        public final void accept(Object obj2) {
                            u.v0(this.f160238a, context, str, (Bitmap) obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(aVarB, "create(...)");
                    com.planner5d.library.services.q.a.a(imageManager, strV, 0, 0, aVarB, 0L, 16, null);
                }
                imageManager = y0Var;
                i10 = i11;
            }
        }
        this.f160252l.setValue(new b(false));
        this.f160257t.o(new com.planner5d.library.services.utility.o<>(Boolean.TRUE));
    }

    public final void w0() {
        j3.d.a(this.f160249i, j3.a.button_click, null, j3.b.back, null, null, null, 58, null);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final AutoStyle f160258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<p> f160259b;

        public a(@Nullable AutoStyle autoStyle, @NotNull List<p> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f160258a = autoStyle;
            this.f160259b = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, AutoStyle autoStyle, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                autoStyle = aVar.f160258a;
            }
            if ((i10 & 2) != 0) {
                list = aVar.f160259b;
            }
            return aVar.c(autoStyle, list);
        }

        @Nullable
        public final AutoStyle a() {
            return this.f160258a;
        }

        @NotNull
        public final List<p> b() {
            return this.f160259b;
        }

        @NotNull
        public final a c(@Nullable AutoStyle autoStyle, @NotNull List<p> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new a(autoStyle, items);
        }

        @Nullable
        public final AutoStyle e() {
            return this.f160258a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f160258a, aVar.f160258a) && Intrinsics.areEqual(this.f160259b, aVar.f160259b);
        }

        @NotNull
        public final List<p> f() {
            return this.f160259b;
        }

        public int hashCode() {
            AutoStyle autoStyle = this.f160258a;
            return ((autoStyle == null ? 0 : autoStyle.hashCode()) * 31) + this.f160259b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ListState(autoStyle=" + this.f160258a + ", items=" + this.f160259b + ")";
        }

        public /* synthetic */ a(AutoStyle autoStyle, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(autoStyle, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }
}
