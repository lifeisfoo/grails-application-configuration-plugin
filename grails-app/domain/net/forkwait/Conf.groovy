package net.forkwait

class Conf {
	String ckey
	String cvalue

	static valuePut(String k, String v){
		def kv = Conf.findByCkey(k)
		if(kv){
			//update
			kv.cvalue = v
		}else{
			//create
			kv = new Conf(ckey: k, cvalue: v)
		}
		kv.save(flush: true)
		return kv //if is null save has failed
	}
	
	static valueGet(String k){
		return Conf.findByCkey(k)
	}

	static valueGet(String k, String value){
		return Conf.valueGet(k) ?: value
	}

    static constraints = {
    	ckey nullable: false, blank:false
    	cvalue nullable: false
    }
}
