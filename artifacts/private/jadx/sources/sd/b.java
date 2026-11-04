package sd;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@ij.f
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f375954c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f375955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f375956b;

    @ij.a
    public b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        boolean z10 = application.getResources().getBoolean(com.planner5d.library.f.e.f166223j);
        this.f375955a = z10;
        if (z10) {
            com.google.firebase.installations.j.u().b(false).addOnCompleteListener(new OnCompleteListener() { // from class: sd.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    b.b(this.f375953a, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b bVar, Task it) {
        p pVar;
        Intrinsics.checkNotNullParameter(it, "it");
        String strB = null;
        if (it.u() && (pVar = (p) it.q()) != null) {
            strB = pVar.b();
        }
        bVar.f375956b = strB;
        timber.log.b.f381052a.a("Firebase token " + strB, new Object[0]);
    }

    public final boolean c() {
        return this.f375955a;
    }

    @Nullable
    public final String d() {
        return this.f375956b;
    }
}
