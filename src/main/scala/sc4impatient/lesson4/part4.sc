//private var end =0
//private val buffer = new Array[Byte](SIZE)
//private var pos = 0

//override def read() = {
//  if(pos==end){
//    log("Buffer was empty")
//    end = super.read(buffer,0,SIZE)
//    pos = 0
//  }
//}

import scala.sys.process._

"ls -al ..".!
