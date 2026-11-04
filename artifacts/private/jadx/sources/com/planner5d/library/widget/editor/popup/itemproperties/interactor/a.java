package com.planner5d.library.widget.editor.popup.itemproperties.interactor;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.imagechooser.j;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a implements af.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257301b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f257302a;

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.popup.itemproperties.interactor.a$a, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.widget.editor.popup.itemproperties.interactor.ChooseImageAndResizeInteractor", f = "ChooseImageAndResizeInteractor.kt", i = {}, l = {19, 22}, m = "chooseImageAndResize", n = {}, s = {})
    static final class C1740a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f257303a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f257305c;

        C1740a(kotlin.coroutines.d<? super C1740a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257303a = obj;
            this.f257305c |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    @f(c = "com.planner5d.library.widget.editor.popup.itemproperties.interactor.ChooseImageAndResizeInteractor$chooseImageAndResize$2", f = "ChooseImageAndResizeInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f257307b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bitmap bitmap, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f257307b = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f257307b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257306a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return td.a.f380845a.o(this.f257307b, 512, 512, td.a.b.CenterFit);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Bitmap> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull j helperImageChooser) {
        Intrinsics.checkNotNullParameter(helperImageChooser, "helperImageChooser");
        this.f257302a = helperImageChooser;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // af.a
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Bitmap> dVar) throws Throwable {
        C1740a c1740a;
        if (dVar instanceof C1740a) {
            c1740a = (C1740a) dVar;
            int i10 = c1740a.f257305c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1740a.f257305c = i10 - Integer.MIN_VALUE;
            } else {
                c1740a = new C1740a(dVar);
            }
        } else {
            c1740a = new C1740a(dVar);
        }
        Object objL = c1740a.f257303a;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1740a.f257305c;
        if (i11 == 0) {
            ResultKt.m(objL);
            c0 c0Var = c0.f225068a;
            Observable<Bitmap> observableE = this.f257302a.E(512, true);
            Intrinsics.checkNotNullExpressionValue(observableE, "request(...)");
            c1740a.f257305c = 1;
            objL = c0Var.l(observableE, c1740a);
            if (objL != objL2) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objL);
            return objL;
        }
        ResultKt.m(objL);
        z1 z1VarD = s.f229729a.d();
        b bVar = new b((Bitmap) objL, null);
        c1740a.f257305c = 2;
        Object objH = i.h(z1VarD, bVar, c1740a);
        return objH == objL2 ? objL2 : objH;
    }
}
