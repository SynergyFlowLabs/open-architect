package dd;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.converter.json.from.c0;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.userimporteddata.i;
import com.planner5d.library.userimporteddata.l;
import com.planner5d.library.userimporteddata.p;
import ij.f;
import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@f
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f269906f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f269907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f269908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p0 f269909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c0 f269910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final u1 f269911e;

    @ij.a
    public a(@NotNull i metadataRepository, @NotNull l modelFileRepository, @NotNull p0 formatter, @NotNull c0 model2dConverter, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
        Intrinsics.checkNotNullParameter(modelFileRepository, "modelFileRepository");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(model2dConverter, "model2dConverter");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f269907a = metadataRepository;
        this.f269908b = modelFileRepository;
        this.f269909c = formatter;
        this.f269910d = model2dConverter;
        this.f269911e = logRecordManager;
    }

    @m1
    private final Model2D b(String str, String str2) throws Throwable {
        JSONObject jSONObjectA = this.f269909c.a(new FileInputStream(this.f269908b.b(str, str2)));
        if (jSONObjectA == null) {
            jSONObjectA = new JSONObject("Could not parse model's JSON file");
        }
        Model2D model2DB = this.f269910d.b(jSONObjectA, null);
        Intrinsics.checkNotNullExpressionValue(model2DB, "convert(...)");
        return model2DB;
    }

    @m1
    @Nullable
    public final Model2D a(@Nullable String str) {
        p pVarB = this.f269907a.b(str, com.planner5d.library.userimporteddata.d.JSON_2D);
        if (pVarB == null) {
            return null;
        }
        try {
            return b(pVarB.e(), pVarB.a());
        } catch (Throwable th2) {
            this.f269911e.b("failed_to_load_2d_user_model", str, th2);
            return null;
        }
    }
}
