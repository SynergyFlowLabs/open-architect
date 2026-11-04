package androidx.datastore.preferences;

import androidx.annotation.b1;
import androidx.datastore.preferences.protobuf.t1;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f49883a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f.b a(@NotNull InputStream input) throws IOException {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f.b bVarP8 = f.b.p8(input);
                Intrinsics.checkNotNullExpressionValue(bVarP8, "{\n                Prefer…From(input)\n            }");
                return bVarP8;
            } catch (t1 e10) {
                throw new androidx.datastore.core.g("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
