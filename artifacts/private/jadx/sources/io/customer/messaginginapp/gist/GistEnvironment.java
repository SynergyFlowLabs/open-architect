package io.customer.messaginginapp.gist;

import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum GistEnvironment implements GistEnvironmentEndpoints {
    DEV { // from class: io.customer.messaginginapp.gist.GistEnvironment.DEV
        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getEngineApiUrl() {
            return "https://engine.api.dev.gist.build";
        }

        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getGistQueueApiUrl() {
            return "https://consumer.dev.inapp.customer.io";
        }

        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getGistRendererUrl() {
            return "https://renderer.gist.build/3.0";
        }
    },
    LOCAL { // from class: io.customer.messaginginapp.gist.GistEnvironment.LOCAL
        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getEngineApiUrl() {
            return "http://engine.api.local.gist.build:82";
        }

        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getGistQueueApiUrl() {
            return "http://queue.api.local.gist.build:86";
        }

        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getGistRendererUrl() {
            return "https://renderer.gist.build/3.0";
        }
    },
    PROD { // from class: io.customer.messaginginapp.gist.GistEnvironment.PROD
        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getEngineApiUrl() {
            return "https://engine.api.gist.build";
        }

        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getGistQueueApiUrl() {
            return "https://consumer.inapp.customer.io";
        }

        @Override // io.customer.messaginginapp.gist.GistEnvironmentEndpoints
        @NotNull
        public String getGistRendererUrl() {
            return "https://renderer.gist.build/3.0";
        }
    };

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    /* synthetic */ GistEnvironment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static a<GistEnvironment> getEntries() {
        return $ENTRIES;
    }
}
