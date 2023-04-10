import React from 'react'
import { useForm } from "react-hook-form";
import 'leaflet/dist/leaflet.css'
import {
  MapContainer,
  Marker,
  TileLayer,
  Tooltip,
  Popup,
  CircleMarker,
  Polygon
} from 'react-leaflet'

const center = [59.938955, 30.315644]
const colorOptions={color:'purple'}
const centerPolygon=[
  [
    [59.952810, 30.303559],
    [59.931855, 30.322861],
    [59.951778, 30.419518],
    [60.005890, 30.419518]
  ]
]

const Form = () => {

  const { register, handleSubmit, watch, formState: { errors } } = useForm();
  const onSubmit = data => console.log(data);

  console.log(watch("example"));

  return (
      <div>
        <form id='form' onSubmit={handleSubmit(onSubmit)}>
          <h1>Заполните заявку на обратную связь</h1>

          <div className='input-group mb-3'>
            <input {...register('lastName',{
              required: true,
              maxLength: 50,
              pattern: /^[А-Яа-я]+$/i
            })} 
            type="text"
            className='form-control'
            placeholder='Фамилия'/>
          </div>
          {errors?.lastName?.type=== 'required'&&(
            <p>Поле обязательно для заполнения</p>
          )}
          {errors?.lastName?.type=== 'maxLength'&&(
            <p>Поле не может содержать более 50 символов</p>
          )}
           {errors?.lastName?.type=== 'pattern'&&(
            <p>Поле заполнено некорректно</p>
          )}

          <div className='input-group mb-3'>
            <input {...register('firstName',{
              required: true,
              maxLength: 50,
              pattern: /^[А-Яа-я]+$/i
            })} 
            type="text"
            className='form-control'
            placeholder='Имя'/>
          </div>
          {errors?.firstName?.type=== 'required'&&(
            <p>Поле обязательно для заполнения</p>
          )}
          {errors?.firstName?.type=== 'maxLength'&&(
            <p>Поле не может содержать более 50 символов</p>
          )}
           {errors?.firstName?.type=== 'pattern'&&(
            <p>Поле заполнено некорректно</p>
          )}

           <div className='input-group mb-3'>
            <input {...register('middleName',{
              required: true,
              maxLength: 50,
              pattern: /^[А-Яа-я]+$/i
            })} 
            type="text"
            className='form-control'
            placeholder='Отчество'/>
          </div>
          {errors?.middleName?.type=== 'required'&&(
            <p>Поле обязательно для заполнения</p>
          )}
          {errors?.middleName?.type=== 'maxLength'&&(
            <p>Поле не может содержать более 50 символов</p>
          )}
           {errors?.middleName?.type=== 'pattern'&&(
            <p>Поле заполнено некорректно</p>
          )}

          <div className='input-group mb-3'>
            <input {...register('email',{
              required: true,
              maxLength: 50,
              pattern: /^([^ ]+@[^ ]+\.[a-z]{2,6}|)+$/i
            })} 
            type="text"
            className='form-control'
            placeholder='Email'/>
          </div>
          {errors?.email?.type=== 'required'&&(
            <p>Поле обязательно для заполнения</p>
          )}
          {errors?.email?.type=== 'maxLength'&&(
            <p>Поле не может содержать более 50 символов</p>
          )}
           {errors?.email?.type=== 'pattern'&&(
            <p>Поле заполнено некорректно</p>
          )}
          <div>
            <input className='btn btn-outline-primary' type="submit" />
          </div>
        </form>
        <br/>
        <br/>
        <MapContainer
        center={center}
        zoom={10}
        style={{
          width: '100vw',
          height: '500px'
        }}
        >
          <TileLayer url='https://api.maptiler.com/maps/basic-v2/256/tiles.json?key=kGCZ4iAVpV714jjl4g2F'
          attribution='<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>'/>

        <CircleMarker
        center={center}
        pathOptions={{color:'black'}}
        radius={10}
        />

        <Marker position={center}>
          <Popup>
            Мы находимся тут
          </Popup>
          <Tooltip>
            При наведении
          </Tooltip>
        </Marker>

        <Polygon positions={centerPolygon} pathOptions={colorOptions}/>

        </MapContainer>      

      </div>
        
      );
    } 

export default Form