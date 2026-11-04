package dd;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.userimporteddata.i;
import com.planner5d.library.userimporteddata.l;
import com.planner5d.library.userimporteddata.n;
import com.planner5d.library.userimporteddata.p;
import ij.f;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@f
public final class c implements ec.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f269917g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f269918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f269919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final l f269920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u1 f269921f;

    @ij.a
    public c(@NotNull n modelNameProcessor, @NotNull i metadataRepository, @NotNull l modelFileRepository, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(modelNameProcessor, "modelNameProcessor");
        Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
        Intrinsics.checkNotNullParameter(modelFileRepository, "modelFileRepository");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f269918c = modelNameProcessor;
        this.f269919d = metadataRepository;
        this.f269920e = modelFileRepository;
        this.f269921f = logRecordManager;
    }

    @Override // ec.b
    @m1
    @Nullable
    public InputStream a(@Nullable String str) throws Throwable {
        if (!this.f269918c.b(str)) {
            return null;
        }
        try {
            p pVarB = this.f269919d.b(str, com.planner5d.library.userimporteddata.d.P3D);
            if (pVarB != null) {
                return new FileInputStream(this.f269920e.b(pVarB.e(), pVarB.a()));
            }
            throw new IllegalArgumentException("No metadata for user-imported model found");
        } catch (Throwable th2) {
            this.f269921f.b("failed_to_load_3d_user_model_file", str, th2);
            throw th2;
        }
    }
}
