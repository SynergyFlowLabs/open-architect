package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkManagerInitializer implements androidx.startup.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f76468a = v.i("WrkMgrInitializer");

    @Override // androidx.startup.b
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m0 create(@NonNull Context context) {
        v.e().a(f76468a, "Initializing WorkManager with default configuration.");
        m0.F(context, new c.a().a());
        return m0.q(context);
    }

    @Override // androidx.startup.b
    @NonNull
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
