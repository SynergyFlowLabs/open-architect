package com.planner5d.library.dgenerator.fragment.gallery.pager;

import android.graphics.Bitmap;
import androidx.annotation.f1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.helper.b0;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.database.model.AutoStyleImage;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.u;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.q;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.s;
import io.intercom.android.sdk.models.AttributeType;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pd.a f160208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final nb.c f160209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b0 f160210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2 f160211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final j3 f160212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final k0<a> f160213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final z0<a> f160214g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f160215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<AutoStyleImage> f160216b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, boolean z10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f160215a;
            }
            if ((i10 & 2) != 0) {
                list = aVar.f160216b;
            }
            return aVar.c(z10, list);
        }

        public final boolean a() {
            return this.f160215a;
        }

        @NotNull
        public final List<AutoStyleImage> b() {
            return this.f160216b;
        }

        @NotNull
        public final a c(boolean z10, @NotNull List<AutoStyleImage> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new a(z10, items);
        }

        @NotNull
        public final List<AutoStyleImage> e() {
            return this.f160216b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f160215a == aVar.f160215a && Intrinsics.areEqual(this.f160216b, aVar.f160216b);
        }

        public final boolean f() {
            return this.f160215a;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f160215a) * 31) + this.f160216b.hashCode();
        }

        @NotNull
        public String toString() {
            return "UiState(loading=" + this.f160215a + ", items=" + this.f160216b + ")";
        }

        public a(boolean z10, @NotNull List<AutoStyleImage> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f160215a = z10;
            this.f160216b = items;
        }

        public /* synthetic */ a(boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.gallery.pager.GalleryPagerViewModel$loadImages$1", f = "GalleryPagerViewModel.kt", i = {1}, l = {45, 48}, m = "invokeSuspend", n = {AttributeType.LIST}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGalleryPagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPagerViewModel.kt\ncom/planner5d/library/dgenerator/fragment/gallery/pager/GalleryPagerViewModel$loadImages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1557#2:118\n1628#2,3:119\n*S KotlinDebug\n*F\n+ 1 GalleryPagerViewModel.kt\ncom/planner5d/library/dgenerator/fragment/gallery/pager/GalleryPagerViewModel$loadImages$1\n*L\n47#1:118\n47#1:119,3\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f160218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f160219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f160220d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f160222f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f160222f = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new b(this.f160222f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d7 -> B:33:0x00d9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.dgenerator.fragment.gallery.pager.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.gallery.pager.GalleryPagerViewModel$saveToGallery$1$1", f = "GalleryPagerViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160223a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f160225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ByteArrayOutputStream f160226d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, ByteArrayOutputStream byteArrayOutputStream, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f160225c = str;
            this.f160226d = byteArrayOutputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new c(this.f160225c, this.f160226d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160223a;
            int i11 = 2 << 1;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c0 c0Var = c0.f225068a;
                    Observable<String> observableM = j.this.f160210c.m(this.f160225c, "png", androidx.media3.common.s0.X0, this.f160226d.toByteArray());
                    Intrinsics.checkNotNullExpressionValue(observableM, "export(...)");
                    this.f160223a = 1;
                    obj = c0Var.l(observableM, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                if (((String) obj) != null) {
                    j.this.m0(u.c.Info, lb.b.s.MF);
                }
            } catch (Exception e10) {
                timber.log.b.f381052a.f(e10, "Failed to export image", new Object[0]);
                j.this.m0(u.c.Error, lb.b.s.Ga);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class d extends com.planner5d.library.services.rx.e<String> {
        d() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            j.this.f160211d.r(new ErrorMessageException(lb.b.s.U9, new String[0]));
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            j.this.o0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public j(@NotNull pd.a getAutoStyleUseCase, @NotNull nb.c getAutoStyleImagesUseCase, @NotNull b0 helperExportToFile, @NotNull b2 messageManager, @NotNull j3 events) {
        Intrinsics.checkNotNullParameter(getAutoStyleUseCase, "getAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(getAutoStyleImagesUseCase, "getAutoStyleImagesUseCase");
        Intrinsics.checkNotNullParameter(helperExportToFile, "helperExportToFile");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f160208a = getAutoStyleUseCase;
        this.f160209b = getAutoStyleImagesUseCase;
        this.f160210c = helperExportToFile;
        this.f160211d = messageManager;
        this.f160212e = events;
        k0<a> k0VarA = b1.a(new a(false, null, 3, 0 == true ? 1 : 0));
        this.f160213f = k0VarA;
        this.f160214g = k0VarA;
    }

    private final void f0(com.planner5d.library.services.bitmaploader.target.h hVar, y0 y0Var, final int i10, final Function2<? super Bitmap, ? super String, Unit> function2) {
        final AutoStyleImage autoStyleImage = this.f160213f.getValue().e().get(i10);
        String strV = autoStyleImage.v();
        if (strV != null) {
            com.planner5d.library.services.bitmaploader.target.a aVarB = new com.planner5d.library.services.bitmaploader.target.a.C1664a().b(hVar, new androidx.core.util.e() { // from class: com.planner5d.library.dgenerator.fragment.gallery.pager.i
                @Override // androidx.core.util.e
                public final void accept(Object obj) {
                    j.g0(function2, autoStyleImage, i10, (Bitmap) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(aVarB, "create(...)");
            if (q.a.a(y0Var, strV, 0, 0, aVarB, 0L, 16, null) != null) {
                return;
            }
        }
        timber.log.b.f381052a.a("Image url is null", new Object[0]);
        Unit unit = Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(Function2 function2, AutoStyleImage autoStyleImage, int i10, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        AutoStyle autoStyleS = autoStyleImage.s();
        Long id2 = autoStyleS != null ? autoStyleS.getId() : null;
        AutoStyle autoStyleS2 = autoStyleImage.s();
        Integer numZ = autoStyleS2 != null ? autoStyleS2.z() : null;
        function2.invoke(bitmap, id2 + "_" + numZ + "_" + autoStyleImage.u() + "_" + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(j jVar, Bitmap bitmap, String name) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(name, "name");
        jVar.n0();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 96, byteArrayOutputStream);
        kotlinx.coroutines.k.f(g2.a(jVar), null, null, jVar.new c(name, byteArrayOutputStream, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(j jVar, Bitmap bitmap, String name) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(name, "name");
        jVar.f160210c.u(name, androidx.media3.common.s0.X0, bitmap).subscribe((Subscriber<? super String>) jVar.new d());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(u.c cVar, @f1 int i10) {
        this.f160211d.e(new u(cVar, new k3(i10, new Object[0]), new u.a[0]));
    }

    private final void n0() {
        j3.d.a(this.f160212e, j3.a.button_click, null, j3.b.save_to_gallery, null, null, null, 58, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0() {
        j3.d.a(this.f160212e, j3.a.button_click, null, j3.b.share, null, null, null, 58, null);
    }

    @NotNull
    public final z0<a> getUiState() {
        return this.f160214g;
    }

    public final void h0(long j10) {
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new b(j10, null), 2, null);
    }

    public final void i0(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, int i10) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        f0(bitmapTargetManager, imageManager, i10, new Function2() { // from class: com.planner5d.library.dgenerator.fragment.gallery.pager.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j.j0(this.f160203a, (Bitmap) obj, (String) obj2);
            }
        });
    }

    public final void k0(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, int i10) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        f0(bitmapTargetManager, imageManager, i10, new Function2() { // from class: com.planner5d.library.dgenerator.fragment.gallery.pager.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j.l0(this.f160204a, (Bitmap) obj, (String) obj2);
            }
        });
    }

    public final void p0() {
        j3.d.a(this.f160212e, j3.a.screen_view, j3.g.single_card, null, null, null, null, 60, null);
    }
}
