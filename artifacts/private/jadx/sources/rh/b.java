package rh;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface b {

    public static final class a implements b {
        @Override // rh.b
        @NotNull
        public File a(@NotNull File existingPath) {
            Intrinsics.checkNotNullParameter(existingPath, "existingPath");
            return new File(existingPath, "queue");
        }

        @Override // rh.b
        @NotNull
        public String getFileName() {
            return "inventory.json";
        }
    }

    /* JADX INFO: renamed from: rh.b$b, reason: collision with other inner class name */
    public static final class C2473b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f366658a;

        public C2473b(@NotNull String fileId) {
            Intrinsics.checkNotNullParameter(fileId, "fileId");
            this.f366658a = fileId;
        }

        @Override // rh.b
        @NotNull
        public File a(@NotNull File existingPath) {
            Intrinsics.checkNotNullParameter(existingPath, "existingPath");
            return new File(new File(existingPath, "queue"), "tasks");
        }

        @Override // rh.b
        @NotNull
        public String getFileName() {
            return this.f366658a + ".json";
        }
    }

    @NotNull
    File a(@NotNull File file);

    @NotNull
    String getFileName();
}
