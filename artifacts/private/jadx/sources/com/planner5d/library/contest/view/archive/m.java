package com.planner5d.library.contest.view.archive;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f153459g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.q f153460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f153461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Context f153462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private db.p f153463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<eb.a> f153464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f153465f;

    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {
        a() {
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            db.p pVar = m.this.f153463d;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pVar = null;
            }
            pVar.f269867d.setImageBitmap(bitmap);
        }
    }

    public m(@NotNull com.planner5d.library.services.q imageManager, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager) {
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        this.f153460a = imageManager;
        this.f153461b = bitmapTargetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(m mVar, int i10) {
        mVar.h(i10);
        return Unit.f312394a;
    }

    private final void e(String str) {
        this.f153461b.d(this.f153465f);
        this.f153465f = null;
        if (str == null) {
            db.p pVar = this.f153463d;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pVar = null;
            }
            pVar.f269867d.setImageBitmap((Bitmap) null);
            return;
        }
        if (this.f153461b.b()) {
            return;
        }
        a aVar = new a();
        this.f153461b.c(aVar);
        this.f153465f = aVar;
        this.f153460a.a(0, str, 0, 0, aVar, -3L, null);
    }

    private final void h(int i10) {
        List<eb.a> list = this.f153464e;
        String string = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("participants");
            list = null;
        }
        eb.a aVar = (eb.a) CollectionsKt.getOrNull(list, i10);
        if (aVar == null) {
            return;
        }
        db.p pVar = this.f153463d;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
        }
        pVar.f269870g.setPlace(aVar.n());
        e(aVar.q());
        db.p pVar2 = this.f153463d;
        if (pVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar2 = null;
        }
        pVar2.f269868e.setText(aVar.m());
        db.p pVar3 = this.f153463d;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar3 = null;
        }
        TextView textView = pVar3.f269869f;
        Integer numP = aVar.p();
        if (numP != null) {
            int iIntValue = numP.intValue();
            Context context = this.f153462c;
            if (context != null) {
                string = context.getString(com.planner5d.library.contest.e.r.f151919w3, Integer.valueOf(iIntValue));
            }
        }
        textView.setText(string);
    }

    public final void c(@NotNull List<eb.a> participants, @NotNull ViewGroup intoContainer, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(participants, "participants");
        Intrinsics.checkNotNullParameter(intoContainer, "intoContainer");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f153464e = participants;
        Context context = intoContainer.getContext();
        this.f153462c = context;
        db.p pVarB = db.p.b(LayoutInflater.from(context), intoContainer);
        this.f153463d = pVarB;
        pVarB.f269865b.H(participants);
        pVarB.f269865b.setOnSlideChange(new Function1() { // from class: com.planner5d.library.contest.view.archive.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.d(this.f153458a, ((Integer) obj).intValue());
            }
        });
    }

    public final void f() {
        db.p pVar = this.f153463d;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
            int i10 = 7 & 0;
        }
        pVar.f269865b.E();
    }

    public final void g() {
        db.p pVar = this.f153463d;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
        }
        pVar.f269865b.F();
    }
}
