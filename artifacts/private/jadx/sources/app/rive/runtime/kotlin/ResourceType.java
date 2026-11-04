package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResourceType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ResourceType makeMaybeResource(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Integer) {
                return new ResourceId(((Number) obj).intValue());
            }
            if (obj instanceof String) {
                return new ResourceUrl((String) obj);
            }
            if (obj instanceof byte[]) {
                return new ResourceBytes((byte[]) obj);
            }
            if (obj instanceof File) {
                return new ResourceRiveFile((File) obj);
            }
            throw new IllegalArgumentException("Incompatible type " + obj.getClass().getSimpleName() + '.');
        }

        private Companion() {
        }
    }

    public static final class ResourceBytes extends ResourceType {

        @NotNull
        private final byte[] bytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceBytes(@NotNull byte[] bytes) {
            super(null);
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.bytes = bytes;
        }

        @NotNull
        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    public static final class ResourceId extends ResourceType {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f77458id;

        public ResourceId(int i10) {
            super(null);
            this.f77458id = i10;
        }

        public final int getId() {
            return this.f77458id;
        }
    }

    public static final class ResourceRiveFile extends ResourceType {

        @NotNull
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceRiveFile(@NotNull File file) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }
    }

    public static final class ResourceUrl extends ResourceType {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceUrl(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ ResourceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ResourceType() {
    }
}
