package com.planner5d.library.activity.fragment.profile.edit.password;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.fragment.profile.edit.q;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.n2;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class f extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f134690d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f134691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f134692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<q> f134693c;

    public static final class a extends com.planner5d.library.services.rx.e<id.a> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            timber.log.b.f381052a.f(th2, "Failed to save user data", new Object[0]);
            if (th2 != null) {
                f.this.f134692b.c(th2);
            }
            f.this.V().r(q.Error);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            n2.f217166b.b();
            f.this.V().r(q.Completed);
        }
    }

    @ij.a
    public f(@NotNull t userAuthorization, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f134691a = userAuthorization;
        this.f134692b = messageManager;
        this.f134693c = new c1<>(q.Initial);
    }

    @NotNull
    public final c1<q> V() {
        return this.f134693c;
    }

    @Nullable
    public final id.a W() {
        return this.f134691a.a();
    }

    public final void X(@NotNull o form, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(form, "form");
        if (form.h()) {
            this.f134693c.r(q.Loading);
            t tVar = this.f134691a;
            id.a aVarW = W();
            id.a aVarW2 = W();
            String str3 = aVarW2 != null ? aVarW2.f287076b : null;
            id.a aVarW3 = W();
            tVar.s0(aVarW, str3, aVarW3 != null ? aVarW3.f287079e : null, str, str2).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super id.a>) new a());
        }
    }
}
