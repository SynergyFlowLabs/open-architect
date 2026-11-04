package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import androidx.annotation.b1;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f73695a = new s();

    private s() {
    }

    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    @NotNull
    public final h a(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicA = j.a(it.next());
            arrayList.add(new t(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        return new h(arrayList);
    }

    @androidx.privacysandbox.ads.adservices.common.q.b
    @x0.a({@x0(extension = 1000000, version = 11), @x0(extension = 31, version = 11)})
    @NotNull
    public final h b(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicA = j.a(it.next());
            arrayList.add(new t(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicA = o.a(it2.next());
            byte[] encryptedTopic = encryptedTopicA.getEncryptedTopic();
            Intrinsics.checkNotNullExpressionValue(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicA.getKeyIdentifier();
            Intrinsics.checkNotNullExpressionValue(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicA.getEncapsulatedKey();
            Intrinsics.checkNotNullExpressionValue(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new a(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new h(arrayList, arrayList2);
    }
}
