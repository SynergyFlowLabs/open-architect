package com.planner5d.library.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.q0;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nToggleFavoriteForGalleryItemInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleFavoriteForGalleryItemInteractor.kt\ncom/planner5d/library/interactor/ToggleFavoriteForGalleryItemInteractor\n*L\n1#1,49:1\n25#1,7:50\n*S KotlinDebug\n*F\n+ 1 ToggleFavoriteForGalleryItemInteractor.kt\ncom/planner5d/library/interactor/ToggleFavoriteForGalleryItemInteractor\n*L\n35#1:50,7\n*E\n"})
public final class n0 implements le.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180232c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.favorite.a f180233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f180234b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f180236b;

        static {
            int[] iArr = new int[q0.c.values().length];
            try {
                iArr[q0.c.projects.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.c.ideas.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.c.favorites.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f180235a = iArr;
            int[] iArr2 = new int[com.planner5d.library.model.manager.favorite.a.b.values().length];
            try {
                iArr2[com.planner5d.library.model.manager.favorite.a.b.ADDED_TO_FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.planner5d.library.model.manager.favorite.a.b.REMOVED_FROM_FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.planner5d.library.model.manager.favorite.a.b.IGNORED_BECAUSE_ONGOING_TO_FAVORITES.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.planner5d.library.model.manager.favorite.a.b.IGNORED_BECAUSE_ONGOING_FROM_FAVORITES.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f180236b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.ToggleFavoriteForGalleryItemInteractor", f = "ToggleFavoriteForGalleryItemInteractor.kt", i = {0, 0}, l = {35}, m = "toggleFavorite", n = {"this", "item"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f180239c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180241e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180239c = obj;
            this.f180241e |= Integer.MIN_VALUE;
            return n0.this.a(null, this);
        }
    }

    @ij.a
    public n0(@NotNull com.planner5d.library.model.manager.favorite.a favoritesRepository, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f180233a = favoritesRepository;
        this.f180234b = messageManager;
    }

    private final com.planner5d.library.database.model.f b(com.planner5d.library.model.h hVar) {
        q0.c cVar = hVar.f180739a;
        int i10 = cVar == null ? -1 : a.f180235a[cVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return com.planner5d.library.database.model.f.GALLERY_PROJECTS;
            }
            if (i10 == 2) {
                return com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS;
            }
            if (i10 != 3) {
                throw new kotlin.k0();
            }
        }
        throw new RuntimeException(hVar + " is not supported to be converted to " + j1.d(com.planner5d.library.database.model.f.class).Q());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // le.o
    @Nullable
    public Object a(@NotNull com.planner5d.library.model.h hVar, @NotNull kotlin.coroutines.d<? super le.o.a> dVar) {
        b bVar;
        com.planner5d.library.database.model.f fVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f180241e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f180241e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objM = bVar.f180239c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f180241e;
        try {
            if (i11 == 0) {
                ResultKt.m(objM);
                com.planner5d.library.model.manager.favorite.a aVar = this.f180233a;
                q0.c cVar = hVar.f180739a;
                int i12 = cVar == null ? -1 : a.f180235a[cVar.ordinal()];
                if (i12 != -1) {
                    if (i12 == 1) {
                        fVar = com.planner5d.library.database.model.f.GALLERY_PROJECTS;
                    } else if (i12 == 2) {
                        fVar = com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS;
                    } else if (i12 != 3) {
                        throw new kotlin.k0();
                    }
                    String id2 = hVar.f180740b;
                    Intrinsics.checkNotNullExpressionValue(id2, "id");
                    bVar.f180237a = this;
                    bVar.f180238b = hVar;
                    bVar.f180241e = 1;
                    objM = aVar.m(fVar, id2, bVar);
                    if (objM == objL) {
                        return objL;
                    }
                }
                throw new RuntimeException(hVar + " is not supported to be converted to " + j1.d(com.planner5d.library.database.model.f.class).Q());
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (com.planner5d.library.model.h) bVar.f180238b;
            ResultKt.m(objM);
            int i13 = a.f180236b[((com.planner5d.library.model.manager.favorite.a.b) objM).ordinal()];
            if (i13 == 1) {
                return new le.o.a(le.o.a.EnumC2327a.LIKE_ADDED, new com.planner5d.library.model.h(hVar, hVar.f180748j + 1));
            }
            if (i13 == 2) {
                return new le.o.a(le.o.a.EnumC2327a.LIKE_REMOVED, new com.planner5d.library.model.h(hVar, hVar.f180748j - 1));
            }
            if (i13 != 3 && i13 != 4) {
                throw new kotlin.k0();
            }
            return new le.o.a(le.o.a.EnumC2327a.FAILED, new com.planner5d.library.model.h(hVar, hVar.f180748j));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            this.f180234b.c(e11);
            return new le.o.a(le.o.a.EnumC2327a.FAILED, new com.planner5d.library.model.h(hVar, hVar.f180748j));
        }
    }
}
