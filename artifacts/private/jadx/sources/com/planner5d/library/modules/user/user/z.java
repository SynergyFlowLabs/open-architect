package com.planner5d.library.modules.user.user;

import android.content.Context;
import android.graphics.Bitmap;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.utility.i3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUserAvatar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAvatar.kt\ncom/planner5d/library/modules/user/user/UserAvatar\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,90:1\n37#2,2:91\n*S KotlinDebug\n*F\n+ 1 UserAvatar.kt\ncom/planner5d/library/modules/user/user/UserAvatar\n*L\n86#1:91,2\n*E\n"})
public final class z implements x1, a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223576e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.y0 f223578d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAvatar$prepareImageForProfile$2", f = "UserAvatar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f223580b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bitmap bitmap, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f223580b = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f223580b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223579a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            int iMin = Math.min(this.f223580b.getWidth(), this.f223580b.getHeight());
            try {
                td.a aVar = td.a.f380845a;
                Bitmap bitmap = this.f223580b;
                return aVar.c(bitmap, (bitmap.getWidth() / 2) - (iMin / 2), (this.f223580b.getHeight() / 2) - (iMin / 2), iMin, iMin, null);
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Bitmap> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAvatar", f = "UserAvatar.kt", i = {}, l = {33}, m = "setUserImage", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223581a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223583c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223581a = obj;
            this.f223583c |= Integer.MIN_VALUE;
            return z.this.f(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAvatar$setUserImage$2", f = "UserAvatar.kt", i = {0}, l = {50}, m = "invokeSuspend", n = {com.facebook.share.internal.k.f101891c}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f223586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f223587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z f223588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.a f223589f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAvatar$setUserImage$2$1", f = "UserAvatar.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f223591b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ id.a f223592c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f223593d;

            /* JADX INFO: renamed from: com.planner5d.library.modules.user.user.z$c$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserAvatar$setUserImage$2$1$1", f = "UserAvatar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1652a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f223594a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f223595b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f223596c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ File f223597d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ id.a f223598e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1652a(File file, id.a aVar, kotlin.coroutines.d<? super C1652a> dVar) {
                    super(3, dVar);
                    this.f223597d = file;
                    this.f223598e = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f223594a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return ((com.planner5d.library.api.b) this.f223595b).v0((id.a) this.f223596c, new com.planner5d.library.api.support.g().a("userpic", new com.planner5d.library.api.support.r("image/jpeg", this.f223597d)), this.f223598e.f287077c);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1652a c1652a = new C1652a(this.f223597d, this.f223598e, dVar);
                    c1652a.f223595b = bVar;
                    c1652a.f223596c = aVar;
                    return c1652a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, id.a aVar, File file, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f223591b = zVar;
                this.f223592c = aVar;
                this.f223593d = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f223591b, this.f223592c, this.f223593d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223590a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f223591b.f223577c;
                id.a aVar = this.f223592c;
                C1652a c1652a = new C1652a(this.f223593d, aVar, null);
                this.f223590a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVar, null, c1652a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, Bitmap bitmap, z zVar, id.a aVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f223586c = context;
            this.f223587d = bitmap;
            this.f223588e = zVar;
            this.f223589f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f223586c, this.f223587d, this.f223588e, this.f223589f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            File file;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223585b;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.e.a aVar = com.planner5d.library.services.e.f224295d;
                Context context = this.f223586c;
                Intrinsics.checkNotNull(context);
                File file2 = new File(aVar.a(context).e(), "temp");
                if (!file2.exists() && !file2.mkdirs()) {
                    throw new RuntimeException("Could not create file");
                }
                try {
                    File fileA = i3.f225278a.a("temp_set_user_image", "jpg", file2);
                    try {
                        this.f223587d.compress(Bitmap.CompressFormat.JPEG, 98, new FileOutputStream(fileA));
                        kotlinx.coroutines.n0 n0VarB = com.planner5d.library.services.utility.s.f229729a.b();
                        a aVar2 = new a(this.f223588e, this.f223589f, fileA, null);
                        this.f223584a = file2;
                        this.f223585b = 1;
                        Object objH = kotlinx.coroutines.i.h(n0VarB, aVar2, this);
                        if (objH == objL) {
                            return objL;
                        }
                        obj = objH;
                        file = file2;
                    } catch (FileNotFoundException unused) {
                        throw new RuntimeException("Could not write file");
                    }
                } catch (IOException unused2) {
                    throw new RuntimeException("Could not create file");
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) this.f223584a;
                ResultKt.m(obj);
            }
            org.apache.commons.io.k.C(file);
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public z(@NotNull com.planner5d.library.api.requests.c api, @NotNull com.planner5d.library.model.manager.y0 imageManager) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f223577c = api;
        this.f223578d = imageManager;
    }

    private final String c(String str) {
        Intrinsics.checkNotNull(str);
        if (StringsKt.V2(str, "://", false, 2, null)) {
            return str;
        }
        return com.planner5d.library.api.f.a().f142272j + "/" + ((String[]) StringsKt.split$default(str, new String[]{"_[0-9]+\\.jpg$"}, false, 0, 6, null).toArray(new String[0]))[0] + "_128.jpg";
    }

    @Override // com.planner5d.library.modules.user.user.a0
    public void a(@Nullable id.a aVar, int i10, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar2) {
        if ((aVar != null ? aVar.f287080f : null) != null) {
            String image = aVar.f287080f;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            if (image.length() != 0) {
                String image2 = aVar.f287080f;
                Intrinsics.checkNotNullExpressionValue(image2, "image");
                if (!StringsKt.M1(image2, "userpic.svg", false, 2, null)) {
                    this.f223578d.b(c(aVar.f287080f), i10, i10, aVar2, 4L);
                    return;
                }
            }
        }
        Intrinsics.checkNotNull(aVar2);
        aVar2.j(null, null);
    }

    @Nullable
    public final Object d(@Nullable Bitmap bitmap, @NotNull kotlin.coroutines.d<? super Bitmap> dVar) {
        if (bitmap == null) {
            return null;
        }
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new a(bitmap, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object f(@NotNull id.a aVar, @Nullable Context context, @NotNull Bitmap bitmap, @NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f223583c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f223583c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objH = bVar.f223581a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f223583c;
        if (i11 == 0) {
            ResultKt.m(objH);
            kotlinx.coroutines.n0 n0VarC = kotlinx.coroutines.l1.c();
            c cVar = new c(context, bitmap, this, aVar, null);
            bVar.f223583c = 1;
            objH = kotlinx.coroutines.i.h(n0VarC, cVar, bVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }
}
