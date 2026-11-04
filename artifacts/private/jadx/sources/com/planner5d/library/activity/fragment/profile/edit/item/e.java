package com.planner5d.library.activity.fragment.profile.edit.item;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.fragment.profile.edit.ProfileEditItem;
import com.planner5d.library.activity.fragment.profile.edit.q;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class e extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f134603d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f134604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f134605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<q> f134606c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134607a;

        static {
            int[] iArr = new int[ProfileEditItem.ProfileEditItemType.values().length];
            try {
                iArr[ProfileEditItem.ProfileEditItemType.Name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileEditItem.ProfileEditItemType.Email.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f134607a = iArr;
        }
    }

    public static final class b extends com.planner5d.library.services.rx.e<id.a> {
        b() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            timber.log.b.f381052a.f(th2, "Failed to save user data", new Object[0]);
            if (th2 != null) {
                e.this.f134605b.c(th2);
            }
            e.this.V().r(q.Error);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            e.this.V().r(q.Completed);
        }
    }

    @ij.a
    public e(@NotNull t userAuthorization, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f134604a = userAuthorization;
        this.f134605b = messageManager;
        this.f134606c = new c1<>(q.Initial);
    }

    private final Observable<id.a> X(ProfileEditItem.ProfileEditItemType profileEditItemType, String str) {
        int i10 = a.f134607a[profileEditItemType.ordinal()];
        if (i10 == 1) {
            t tVar = this.f134604a;
            id.a aVarW = W();
            id.a aVarW2 = W();
            return tVar.s0(aVarW, str, aVarW2 != null ? aVarW2.f287079e : null, null, null);
        }
        if (i10 != 2) {
            throw new k0();
        }
        t tVar2 = this.f134604a;
        id.a aVarW3 = W();
        id.a aVarW4 = W();
        return tVar2.s0(aVarW3, aVarW4 != null ? aVarW4.f287076b : null, str, null, null);
    }

    @NotNull
    public final c1<q> V() {
        return this.f134606c;
    }

    @Nullable
    public final id.a W() {
        return this.f134604a.a();
    }

    public final void Y(@NotNull o form, @NotNull ProfileEditItem.ProfileEditItemType profileEditItemType, @NotNull String newValue) {
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(profileEditItemType, "profileEditItemType");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (form.h()) {
            this.f134606c.r(q.Loading);
            X(profileEditItemType, newValue).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super id.a>) new b());
        }
    }
}
