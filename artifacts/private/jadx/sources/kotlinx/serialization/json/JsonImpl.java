package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonSerializersModuleValidator;
import kotlinx.serialization.modules.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class JsonImpl extends Json {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonImpl(@NotNull JsonConfiguration configuration, @NotNull kotlinx.serialization.modules.f module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        validateConfiguration();
    }

    private final void validateConfiguration() {
        if (Intrinsics.areEqual(getSerializersModule(), h.a())) {
            return;
        }
        getSerializersModule().a(new JsonSerializersModuleValidator(getConfiguration()));
    }
}
