package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class DebugImage implements m2, k2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";

    @Nullable
    private String arch;

    @Nullable
    private String codeFile;

    @Nullable
    private String codeId;

    @Nullable
    private String debugFile;

    @Nullable
    private String debugId;

    @Nullable
    private String imageAddr;

    @Nullable
    private Long imageSize;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String uuid;

    public static final class a implements a2<DebugImage> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            DebugImage debugImage = new DebugImage();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "debug_file":
                        debugImage.debugFile = y3Var.n6();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = y3Var.n6();
                        break;
                    case "image_size":
                        debugImage.imageSize = y3Var.Gc();
                        break;
                    case "code_file":
                        debugImage.codeFile = y3Var.n6();
                        break;
                    case "arch":
                        debugImage.arch = y3Var.n6();
                        break;
                    case "type":
                        debugImage.type = y3Var.n6();
                        break;
                    case "uuid":
                        debugImage.uuid = y3Var.n6();
                        break;
                    case "debug_id":
                        debugImage.debugId = y3Var.n6();
                        break;
                    case "code_id":
                        debugImage.codeId = y3Var.n6();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        y3Var.gd(iLogger, map, strNa);
                        break;
                }
            }
            y3Var.F1();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306085a = "uuid";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306086b = "type";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306087c = "debug_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306088d = "debug_file";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306089e = "code_id";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306090f = "code_file";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306091g = "image_addr";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f306092h = "image_size";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f306093i = "arch";
    }

    @Nullable
    public String getArch() {
        return this.arch;
    }

    @Nullable
    public String getCodeFile() {
        return this.codeFile;
    }

    @Nullable
    public String getCodeId() {
        return this.codeId;
    }

    @Nullable
    public String getDebugFile() {
        return this.debugFile;
    }

    @Nullable
    public String getDebugId() {
        return this.debugId;
    }

    @Nullable
    public String getImageAddr() {
        return this.imageAddr;
    }

    @Nullable
    public Long getImageSize() {
        return this.imageSize;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.uuid != null) {
            z3Var.f("uuid").b(this.uuid);
        }
        if (this.type != null) {
            z3Var.f("type").b(this.type);
        }
        if (this.debugId != null) {
            z3Var.f(b.f306087c).b(this.debugId);
        }
        if (this.debugFile != null) {
            z3Var.f(b.f306088d).b(this.debugFile);
        }
        if (this.codeId != null) {
            z3Var.f(b.f306089e).b(this.codeId);
        }
        if (this.codeFile != null) {
            z3Var.f(b.f306090f).b(this.codeFile);
        }
        if (this.imageAddr != null) {
            z3Var.f("image_addr").b(this.imageAddr);
        }
        if (this.imageSize != null) {
            z3Var.f(b.f306092h).i(this.imageSize);
        }
        if (this.arch != null) {
            z3Var.f(b.f306093i).b(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.unknown.get(str));
            }
        }
        z3Var.F1();
    }

    public void setArch(@Nullable String str) {
        this.arch = str;
    }

    public void setCodeFile(@Nullable String str) {
        this.codeFile = str;
    }

    public void setCodeId(@Nullable String str) {
        this.codeId = str;
    }

    public void setDebugFile(@Nullable String str) {
        this.debugFile = str;
    }

    public void setDebugId(@Nullable String str) {
        this.debugId = str;
    }

    public void setImageAddr(@Nullable String str) {
        this.imageAddr = str;
    }

    public void setImageSize(@Nullable Long l10) {
        this.imageSize = l10;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(@Nullable String str) {
        this.uuid = str;
    }

    public void setImageSize(long j10) {
        this.imageSize = Long.valueOf(j10);
    }
}
