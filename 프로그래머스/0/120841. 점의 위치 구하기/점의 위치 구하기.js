const solution =(dot)=>{
    return dot[0]>0?(dot[1]>0?1:4):(dot[1]>0?2:3)
}

//1양, 1양 => 1사분면 dot[0]>0, dot[1]>0
// -1음,-1음 => 2사분면 dot[0]<0, dot[1]<0
// 1양, -1음 =>4사분면 dot[0]>0, dot[1]<0
// -1음 ,1양 =? 3사분면 dot[0]<0, dot[1]>0