package com.rabbitmq.tools.jsonrpc;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class a implements e {
    @Override // com.rabbitmq.tools.jsonrpc.e
    public e.a a(String str, j jVar) {
        Map map = (Map) new com.rabbitmq.tools.json.a().i(str);
        return new e.a(map.get("id"), map.get("version").toString(), map.get("method").toString(), ((List) map.get("params")).toArray());
    }

    @Override // com.rabbitmq.tools.jsonrpc.e
    public e.b b(String str, Class<?> cls) {
        d dVar;
        Map map = (Map) new com.rabbitmq.tools.json.a().i(str);
        if (map.containsKey("error")) {
            Map map2 = (Map) map.get("error");
            dVar = new d(new com.rabbitmq.tools.json.d().s(map2), (String) map2.get("name"), map2.get("code") == null ? 0 : ((Integer) map2.get("code")).intValue(), (String) map2.get("message"), map2);
        } else {
            dVar = null;
        }
        return new e.b(map.get("result"), map.get("error"), dVar);
    }

    @Override // com.rabbitmq.tools.jsonrpc.e
    public String c(Object obj) {
        return new com.rabbitmq.tools.json.d().s(obj);
    }
}
