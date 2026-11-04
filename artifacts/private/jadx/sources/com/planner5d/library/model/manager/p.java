package com.planner5d.library.model.manager;

import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f192236c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.favorite.a f192237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f192238b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.DesignOfTheDayFavoriteManager", f = "DesignOfTheDayFavoriteManager.kt", i = {0}, l = {18}, m = "toggleFavorite", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192240b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192242d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192240b = obj;
            this.f192242d |= Integer.MIN_VALUE;
            return p.this.b(null, this);
        }
    }

    @ij.a
    public p(@NotNull com.planner5d.library.model.manager.favorite.a favoritesRepository, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f192237a = favoritesRepository;
        this.f192238b = messageManager;
    }

    @Nullable
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return this.f192237a.g(com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS, str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.favorite.a.b> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f192242d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f192242d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objM = aVar.f192240b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f192242d;
        try {
            if (i11 == 0) {
                ResultKt.m(objM);
                com.planner5d.library.model.manager.favorite.a aVar2 = this.f192237a;
                com.planner5d.library.database.model.f fVar = com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS;
                aVar.f192239a = this;
                aVar.f192242d = 1;
                objM = aVar2.m(fVar, str, aVar);
                if (objM == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (p) aVar.f192239a;
                ResultKt.m(objM);
            }
            return (com.planner5d.library.model.manager.favorite.a.b) objM;
        } catch (ErrorMessageException e10) {
            this.f192238b.r(e10);
            return null;
        }
    }
}
