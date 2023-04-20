import style from './footer.module.css';

const Footer =()=>{
    return(
        <footer>
                <div className={style.logo}>
                TYR & IK
                </div>
                <p>
                Единый многоканальный номер: +7 (495) 333-22-11
                <br/>
                <br/>
                Уполномоченные агентства ООО "Туристическая компания Икарис"
                </p>
            </footer>
    )
}
export default Footer