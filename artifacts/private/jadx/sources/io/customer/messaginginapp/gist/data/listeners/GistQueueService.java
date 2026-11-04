package io.customer.messaginginapp.gist.data.listeners;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import io.customer.messaginginapp.gist.data.model.Message;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
public interface GistQueueService {

    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchMessagesForUser$default(GistQueueService gistQueueService, Object obj, String str, d dVar, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMessagesForUser");
            }
            if ((i10 & 1) != 0) {
                obj = new Object();
            }
            return gistQueueService.fetchMessagesForUser(obj, str, dVar);
        }
    }

    @POST("/api/v3/users")
    @Nullable
    Object fetchMessagesForUser(@Body @NotNull Object obj, @NotNull @Query(UserEntry.sessionId) String str, @NotNull d<? super Response<List<Message>>> dVar);

    @POST("/api/v1/logs/message/{messageId}")
    @Nullable
    Object logMessageView(@Path("messageId") @NotNull String str, @NotNull @Query(UserEntry.sessionId) String str2, @NotNull d<? super Unit> dVar);

    @POST("/api/v1/logs/queue/{queueId}")
    @Nullable
    Object logUserMessageView(@Path("queueId") @NotNull String str, @NotNull @Query(UserEntry.sessionId) String str2, @NotNull d<? super Unit> dVar);
}
