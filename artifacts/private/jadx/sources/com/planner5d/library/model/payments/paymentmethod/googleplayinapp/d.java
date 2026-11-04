package com.planner5d.library.model.payments.paymentmethod.googleplayinapp;

import android.content.Context;
import com.android.billingclient.api.n;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ErrorMessageException {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(@NotNull Context context, @Nullable n nVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = qd.b.q.f353262v8;
        Integer numValueOf = nVar != null ? Integer.valueOf(nVar.b()) : null;
        super(i10, (numValueOf != null && numValueOf.intValue() == 3) ? context.getString(qd.b.q.f353310x8) : (numValueOf != null && numValueOf.intValue() == 1) ? context.getString(qd.b.q.f353334y8) : (numValueOf != null && numValueOf.intValue() == 5) ? context.getString(qd.b.q.J8, "#D") : (numValueOf != null && numValueOf.intValue() == 6) ? context.getString(qd.b.q.J8, "#E") : (numValueOf != null && numValueOf.intValue() == 0) ? context.getString(qd.b.q.J8, "#O") : (numValueOf != null && numValueOf.intValue() == -2) ? context.getString(qd.b.q.B8) : (numValueOf != null && numValueOf.intValue() == -1) ? context.getString(qd.b.q.G8) : (numValueOf != null && numValueOf.intValue() == 2) ? context.getString(qd.b.q.I8) : (numValueOf != null && numValueOf.intValue() == 4) ? context.getString(qd.b.q.F8) : (numValueOf != null && numValueOf.intValue() == 7) ? context.getString(qd.b.q.E8) : (numValueOf != null && numValueOf.intValue() == 8) ? context.getString(qd.b.q.C8) : (numValueOf != null && numValueOf.intValue() == 12) ? context.getString(qd.b.q.H8) : numValueOf == null ? context.getString(qd.b.q.A8) : context.getString(qd.b.q.J8, nVar.a()));
    }
}
