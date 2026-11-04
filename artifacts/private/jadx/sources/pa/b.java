package pa;

import java.security.InvalidParameterException;
import kotlin.Pair;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    public enum a {
        Dxf("dxf-2d"),
        Dwg("dwg-2d");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f340825e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f340826a;

        a(String str) {
            this.f340826a = str;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f340825e;
        }

        @NotNull
        public final String n() {
            return this.f340826a;
        }
    }

    /* JADX INFO: renamed from: pa.b$b, reason: collision with other inner class name */
    public enum EnumC2457b {
        UploadingDataToGetQueueName,
        ConnectingToQueue,
        ConnectedWaitingForData,
        LoadedData,
        Finished,
        Error;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f340834h = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<EnumC2457b> l() {
            return f340834h;
        }
    }

    @Nullable
    Object a(@NotNull String str, @NotNull a aVar, @NotNull kotlin.coroutines.d<? super i<? extends Pair<? extends EnumC2457b, ? extends JSONObject>>> dVar) throws InvalidParameterException, com.planner5d.library.api.e;
}
